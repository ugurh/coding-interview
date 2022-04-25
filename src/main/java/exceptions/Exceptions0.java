package exceptions;

public class Exceptions0 {

    public static void main(String[] args) {

        try {
            throw new ArithmeticException();
        } catch (Exception e) {
            System.out.println("Catch");
            throw new NullPointerException();
        } finally {
            System.out.println("Finally");
            throw new NumberFormatException();
        }
    }
}
