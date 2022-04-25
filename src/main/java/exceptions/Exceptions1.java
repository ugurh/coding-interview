package exceptions;

public class Exceptions1 {

    public static void main(String[] args) {

        try {
            System.out.println("A");
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("B");
        }
    }
}
