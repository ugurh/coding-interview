package problems;

public class Check2StringArraysEquivalent {
    /**
     * Given two string arrays word1 and word2, return true if the two arrays represent the same string,
     * and false otherwise.
     * A string is represented by an array if the array elements concatenated in order forms the string.
     * Example 1:
     * Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
     * Output: true
     * Explanation:
     * word1 represents string "ab" + "c" -> "abc"
     * word2 represents string "a" + "bc" -> "abc"
     * The strings are the same, so return true.
     * Example 2:
     * Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
     * Output: false
     * Example 3:
     * Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
     * Output: true
     */

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        for (String world : word1) {
            sb1.append(world);
        }

        StringBuilder sb2 = new StringBuilder();
        for (String world : word2) {
            sb2.append(world);
        }

        return sb1.toString().equals(sb2.toString());
    }

    public static boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        int i = 0; int j = 0;
        int p = 0; int q = 0;

        while (i < word1.length && j < word2.length) {
            if (word1[i].charAt(p) != word2[j].charAt(q)) {
                return false;
            }
            p++;
            q++;

            if (p == word1[i].length()) {
                p = 0;
                i++;
            }

            if (q == word2[j].length()) {
                q = 0;
                j++;
            }
        }
        return i == word1.length && j == word2.length;
    }

    public static void main(String[] args) {
        String[] arr1 = {"ab", "c"};
        String[] arr2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(arr1, arr2));
    }
}
