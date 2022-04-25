package exceptions;

public class Exceptions23 {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            // exception thrown here
            System.out.print(a / b);
        } catch (ArithmeticException | NullPointerException e) {
            // exception caught here
            System.out.print("A");
        }
    }

}
