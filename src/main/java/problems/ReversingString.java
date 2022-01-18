package problems;

public class ReversingString {

    // reverse a string using recursion
    public static String reverseString(String str){
        if(str.isEmpty()) return str;
        else return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "Hello World";

        System.out.println( "The Original String is: ");
        System.out.println(str);

        String reversedStr = reverseString(str);

        System.out.println("String after reversal: ");
        System.out.println(reversedStr);
    }
}
