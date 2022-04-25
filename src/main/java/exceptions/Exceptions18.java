package exceptions;

public class Exceptions18 {
    public static void main(String[] args) {
        String str = "#^6";
        try {
            int i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("A");
        } catch (ArithmeticException e) {
            System.out.println("B");
            return;
        } catch (Exception e) {
            System.out.println("C");
        } finally {
            System.out.println("D");
        }
        System.out.println("E");
    }
}
