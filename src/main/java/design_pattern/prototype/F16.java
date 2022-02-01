package design_pattern.prototype;

public class F16 implements IAircraftPrototype{

    private F16Engine f16Engine = new F16Engine("");

    @Override
    public void fly() {
        System.out.println("F16 flying");
    }

    @Override
    public IAircraftPrototype clone() {
        return new F16();
    }

    @Override
    public void setEngine(F16Engine f16Engine) {
        this.f16Engine = f16Engine;
    }

    @Override
    public String toString() {
        return "F16{" +
                "f16Engine=" + f16Engine +
                '}';
    }
}
