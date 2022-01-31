package design_pattern.builder;

public abstract class AircraftBuilder {

    public void buildEngine() {
    }

    public void buildWings() {
    }

    public void buildCockpit() {
    }

    public void buildBathroom() {
        System.out.println("Aircraft is built Bathroom");

    }

    abstract public IAircraft getResult();

}
