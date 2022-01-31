package design_pattern.builder;

public class Boeing747Builder extends AircraftBuilder{

    Boeing747 boeing747;

    @Override
    public IAircraft getResult() {
        return boeing747;
    }

    @Override
    public void buildEngine() {
        System.out.println("Boeing747 is built Engine");
    }

    @Override
    public void buildWings() {
        System.out.println("Boeing747 is built Wings");
    }

    @Override
    public void buildCockpit() {
        System.out.println("Boeing747 is built Cockpit");
    }

}
