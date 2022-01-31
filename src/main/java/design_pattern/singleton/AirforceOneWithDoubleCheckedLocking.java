package design_pattern.singleton;

public class AirforceOneWithDoubleCheckedLocking {

    private volatile static  AirforceOneWithDoubleCheckedLocking instance;

    private AirforceOneWithDoubleCheckedLocking() {
    }

    public synchronized AirforceOneWithDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (AirforceOneWithDoubleCheckedLocking.class) {
                instance = new AirforceOneWithDoubleCheckedLocking();
            }
        }

        return instance;
    }

    public void fly() {
        System.out.println("Airforce one is flying...");
    }
}
