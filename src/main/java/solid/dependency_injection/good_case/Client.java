package solid.dependency_injection.good_case;

public class Client {

    public static void main(String[] args) {
        Car car = new ManuelCar(new DieselEngine());
        car.drive();

        Car car1 = new ManuelCar();

        ((ManuelCar) car1).setEngine(new DieselEngine());
        car.drive();
    }
}
