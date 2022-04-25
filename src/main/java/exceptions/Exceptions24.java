package exceptions;

class Exceptions24 {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static int method1() {
        int value = 0;
        try {
            throw new NumberFormatException();
        } catch (NumberFormatException e) {
            value = 1;
            return value;
        } finally {
            System.out.println("Finally");
            value += 1;
            return value;
        }
       //  return value;  the last return statement is unreachable.
    }
}