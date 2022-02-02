package solid.dependency_injection.bad_case;

public class Client {

    public static void main(String[] args) {
        Car car = new Car(new DieselEngine());
        car.drive();
    }
}
