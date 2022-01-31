package design_pattern.builder.fluent_builder;

public class Client {

    public static void main(String[] args) {

        Aircraft aircraft = new Aircraft.Builder()
                .capacity(136)
                .model("F16")
                .colour("White")
                .builder();

        System.out.println(aircraft.toString());
    }
}
