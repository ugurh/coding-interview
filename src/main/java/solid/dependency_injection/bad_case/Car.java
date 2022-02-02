package solid.dependency_injection.bad_case;

public class Car {

    DieselEngine dieselEngine;

    public Car(DieselEngine dieselEngine){
        this.dieselEngine = dieselEngine;
    }
    void drive() {
        dieselEngine.start();
    }
}
