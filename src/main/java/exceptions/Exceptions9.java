package exceptions;

public class Exceptions9 {

    public static void main(String args[]) {
        int months = 5;
        int salary = 0;

        try {
            System.out.print(months / salary); // 5/0 will throw a Arithmetic Exception
        } catch (NullPointerException e) {
            System.out.println("Exception caught");
        } finally { // this is an optional block
            // will always be executed
            System.out.println("Finally executed");
        }
    }
}
