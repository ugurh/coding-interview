package bridge;

public class Client {

    public static void main(String[] args) {
        Abstraction absA = new Abstraction(new ImpA());
        Abstraction absB = new Abstraction(new ImpB());

        absA.print();
        absB.print();

    }
}
