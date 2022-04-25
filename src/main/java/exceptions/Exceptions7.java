package exceptions;

public class Exceptions7 {
    public static void main(String args[]) {
        int a = 5;
        int b = 0;

        try {
            try {
                a = a / b;
            } finally {
                System.out.print("B");
            }
        } catch (ArithmeticException e) {
            System.out.print("A");
        }

    }
}
