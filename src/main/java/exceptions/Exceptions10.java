package exceptions;

public class Exceptions10 {
    public static void main(String args[]) {
        int value = 5;

        System.out.println("Value returned: " + findNumber(value));
    }

    public static int findNumber(int value) {
        Integer[] arr = null;

        try {
            System.out.println(arr[0]);
        } catch (NullPointerException e) {
            // exception caught here
            return value;
        } finally { // this is an optional block
            // will always be executed
            System.out.println("Finally executed");
        }
        return value;
    }
}
//Output:
// Finally executed
// Value returned: 5
