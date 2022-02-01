package design_pattern.prototype;

public class Client {

    public static void main(String[] args) {

        IAircraftPrototype prototype = new F16();

        IAircraftPrototype f16A = prototype.clone();
        f16A.setEngine(new F16Engine("A"));

        IAircraftPrototype f16B = prototype.clone();
        f16B.setEngine(new F16Engine("B"));

        System.out.println(f16A);
        System.out.println(f16B);

    }
}
