package exceptions;

public class Exceptions12 {

    public static void main(String[] args) {
        child c = new child();
        System.out.print("Returned Value is " + c.method1()[0]);

    }
}

class child {
    public int[] method1() {
        int[] arr = {1};
        try {
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught value is " + arr[0]);
            return arr; // value is being returned from inside catch
        } finally {
            arr[0] = 2;
            System.out.println("Finally value is " + arr[0]);
        }
        return arr; //returning a referential type variable
    }
}