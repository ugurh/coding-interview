package problems;

public class ToLowerCase {
    /**
     * Given a string s, return the string after replacing every uppercase letter
     * with the same lowercase letter.
     * Example 1:
     * Input: s = "Hello"
     * Output: "hello"
     * Example 2:
     * Input: s = "here"
     * Output: "here"
     * Example 3:
     * Input: s = "LOVELY"
     * Output: "lovely"
     */

    public static String toLowerCase(String s) {
        StringBuilder output = new StringBuilder();
        for(char current : s.toCharArray()) {
            if(current >= 65 && current <= 90) {
                output.append((char) (current + 32));
            }else {
                output.append(current);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(toLowerCase("LOVELY"));
    }
}
