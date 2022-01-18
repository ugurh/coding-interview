package problems;

import java.util.HashMap;

public class CheckSentenceIsPangram {
    /**
     * A pangram is a sentence where every letter of the English alphabet appears at least once.
     * Given a string sentence containing only lowercase English letters,
     * return true if sentence is a pangram, or false otherwise.
     * Example 1:
     * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
     * Output: true
     * Explanation: sentence contains at least one of every letter of the English alphabet.
     * Example 2:
     * Input: sentence = "leetcode"
     * Output: false
     */

    public static boolean checkIfPangram(String sentence) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabets.length(); i++) {
            if (!sentence.contains(Character.toString(alphabets.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfPangram2(String sentence) {
        if (sentence.length() < 26) return false;
        HashMap<Character, Boolean> map = new HashMap<>(26);
        for (char c = 'a'; c <= 'z'; c++) {
            map.put(c, false);
        }
        for (char c : sentence.toCharArray()) {
            map.put(c, true);
        }
        for (boolean val : map.values()) if (!val) return val;
        return true;
    }

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

}
