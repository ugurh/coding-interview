package design_pattern.singleton;

public class AirforceOne {

    private static AirforceOne instance = new AirforceOne();

    private AirforceOne() {
    }

    public static AirforceOne getInstance() {
        if (instance == null)
            instance = new AirforceOne();
        return instance;
    }

    public static void flying(){
        System.out.println("Airforce one is flying...");
    }
}
