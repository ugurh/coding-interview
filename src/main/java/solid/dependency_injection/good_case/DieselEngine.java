package solid.dependency_injection.good_case;

public class DieselEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Diesel engine started...");
    }
}
