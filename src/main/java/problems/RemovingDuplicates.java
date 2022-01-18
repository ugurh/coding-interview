package problems;

public class RemovingDuplicates {

    // remove duplicates in a string using recursion.
    public static String removeDuplicates(String str) {
        if (str.length() == 1)
            return str;

        if (str.substring(0, 1).equals(str.substring(1, 2)))
            return removeDuplicates(str.substring(1));
        else
            return str.substring(0, 1) + removeDuplicates(str.substring(1));
    }

    public static void main(String[] args) {
        String input1 = "Helloo";
        String input2 = "Thiss iiss aa teesstt";

        System.out.println("Original string: " + input1);

        String output = removeDuplicates(input2);

        System.out.println("String after: " + output);
    }
}
