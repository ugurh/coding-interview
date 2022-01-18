package problems;

public class CountNumberConsistentStrings {
    /**
     * You are given a string allowed consisting of distinct characters and an array of strings words.
     * A string is consistent if all characters in the string appear in the string allowed.
     * Return the number of consistent strings in the array words.
     * Example 1:
     * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
     * Output: 2
     * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
     * Example 2:
     * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
     * Output: 7
     * Explanation: All strings are consistent.
     * Example 3:
     * Input: allowed = "cad", words = ["cc","acd","b","ba","bac","bad","ac","d"]
     * Output: 4
     * Explanation: Strings "cc", "acd", "ac", and "d" are consistent.
     */

    public static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (String word : words) {
            boolean isConsisten = true;
            for (char c : word.toCharArray()) {
                if (!allowed.contains(Character.toString(c))) {
                    isConsisten = false;
                    break;
                }
            }
            if (isConsisten)
                count++;
        }
        return count;
    }

    public static int countConsistentStrings2(String allowed, String[] words) {
        int ans = 0;
        boolean[] letters = new boolean[26];
        for (int i = 0; i < allowed.length(); i++) {
            letters[allowed.charAt(i) - 'a'] = true;
        }

        FOR:
        for (String word : words) {
            for (int j = 0; j < word.length(); j++) {
                if (!letters[word.charAt(j) - 'a']) {
                    continue FOR;
                }
            }
            ans++;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] s = {"cc", "acd", "b", "ba", "bac", "bad", "ac", "d"};
        System.out.println(countConsistentStrings2("cad", s));
    }
}
