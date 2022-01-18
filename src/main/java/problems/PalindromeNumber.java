package problems;

public class PalindromeNumber {

    /**
        Complexity Analysis;
        Time complexity : O(log10^n)
        We divided the input by 10 for every iteration, so the time complexity is O(log10^n)
        Space complexity : O(1)
     */
    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int rev = 0, n = x;
        while (x > 0) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
