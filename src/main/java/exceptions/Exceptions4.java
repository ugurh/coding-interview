package exceptions;

public class Exceptions4 {

    public static void main(String args[]) {

        try {
            // exception thrown here
            throw new NumberFormatException();
        } catch (Exception e) {
            // exception caught here
            System.out.print("A");
        }/*
        catch(NumberFormatException e){ //Exception 'java.lang.NumberFormatException' has already been caught
            System.out.print("B");
            // Unreachable statement here
        }catch(ArithmeticException e){ // Exception 'java.lang.ArithmeticException' has already been caught
            System.out.print("C");
            // Unreachable statement here
        }
*/
    }
}
