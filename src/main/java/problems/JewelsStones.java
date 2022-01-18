package problems;

public class JewelsStones {
    /**
     * You're given strings jewels representing the types of stones that are jewels,
     * and stones representing the stones you have.
     * Each character in stones is a type of stone you have.
     * You want to know how many of the stones you have are also jewels.
     * Letters are case sensitive, so "a" is considered a different type of stone from "A".
     * <p>
     * Example 1:
     * Input: jewels = "aA", stones = "aAAbbbb"
     * Output: 3
     * <p>
     * Constraints
     * 1 <= jewels.length, stones.length <= 50
     * jewels and stones consist of only English letters.
     * All the characters of jewels are unique.
     */

    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        for (int s = 0; s < stones.length(); s++) {
            char character = stones.charAt(s);
            for (int j = 0; j < jewels.length(); j++) {
                if ( character == jewels.charAt(j) ) {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }
}
