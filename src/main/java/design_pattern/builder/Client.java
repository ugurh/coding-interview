package design_pattern.builder;

public class Client {

    public static void main(String args[]) {

        F16Builder f16Builder = new F16Builder();
        Director director = new Director(f16Builder);
        director.construct(false);

        Boeing747Builder boeing747Builder = new Boeing747Builder();
        Director director1 = new Director(boeing747Builder);
        director1.construct(true);
    }
}
