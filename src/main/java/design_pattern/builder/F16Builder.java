package design_pattern.builder;

public class F16Builder extends AircraftBuilder{

    F16 f16;

    @Override
    public IAircraft getResult() {
        return f16;
    }

    @Override
    public void buildEngine() {
        System.out.println("F16 is built Engine");
    }

    @Override
    public void buildWings() {
        System.out.println("F16 is built Wings");
    }

    @Override
    public void buildCockpit() {
        System.out.println("F16 is built Cockpit");
    }

}
