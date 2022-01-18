package problems;

import java.util.Stack;

public class SplitStringBalancedStrings {

    /**
     * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
     * Given a balanced string s, split it in the maximum amount of balanced strings.
     * Return the maximum amount of split balanced strings.
     * Example 1:
     * Input: s = "RLRRLLRLRL"
     * Output: 4
     * Explanation: s can be split into "RL", "RRLL", "RL", "RL",
     * each substring contains same number of 'L' and 'R'.
     */

    public static int balancedStringSplit(String s) {
        if(s==null || s.length()==0)
            return 0;

        int output = 0;
        int r = 0, l = 0;
        for (int i = 0; i < s.length(); i++) {
            if ('R' == s.charAt(i))
                r++;
            else
                l++;

            if (r == l) {
                r = 0;
                l = 0;
                output++;
            }
        }
        return output;
    }

    public int balancedStringSplit2(String s) {
        if(s==null || s.length()==0)
            return 0;

        Stack<Character> stack = new Stack<>();
        int output = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) stack.push(c);
            else if (stack.peek() == c) stack.push(c);
            else {
                stack.pop();
                if (stack.isEmpty()) output++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(balancedStringSplit("RLRRLLRLRL"));
    }
}
