package exceptions;

public class Exceptions20 {
    public static void main(String[]args) throws Exception {
        int[] arr = null;
        int value = arr[getLocation()];
    }

    public static int getLocation() throws Exception {
        throw new Exception();
    }
}
