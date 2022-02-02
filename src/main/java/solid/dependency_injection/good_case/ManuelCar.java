package solid.dependency_injection.good_case;

public class ManuelCar implements Car {

    Engine engine;

    public ManuelCar(){}

    public ManuelCar(Engine engine){
        this.engine = engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void drive() {
        this.engine.start();
    }
}
