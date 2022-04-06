package exceptions;

public class Exceptions5 {
    public static void main(String args[]) {

        try {
            // exception thrown here
            throw new NumberFormatException();
        } catch (NumberFormatException e) { //sub-class
            // exception caught here
            System.out.print("A");
        } catch (ArithmeticException e) {// sub-class
            System.out.print("B");
            // Unreachable statement here
        } catch (Exception e) { //super-class
            System.out.print("C");
            // Unreachable statement here
        }

    }
}
