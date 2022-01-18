package problems;

public class TruncateSentence {
    /**
     * A sentence is a list of words that are separated by a single space with no leading or
     * trailing spaces. Each of the words consists of only uppercase and
     * lowercase English letters (no punctuation).
     * For example, "Hello World", "HELLO", and "hello world hello world" are all sentences.
     * You are given a sentence s and an integer k.
     * You want to truncate s such that it contains only the first k words.
     * Return s after truncating it.
     * Example 1:
     * Input: s = "Hello how are you Contestant", k = 4
     * Output: "Hello how are you"
     * Explanation:
     * The words in s are ["Hello", "how" "are", "you", "Contestant"].
     * The first 4 words are ["Hello", "how", "are", "you"].
     * Hence, you should return "Hello how are you".
     */
    public static String truncateSentence(String s, int k) {
        int count = 0;
        int i = 0;
        for( ; i<s.length(); i++){
            if (s.charAt(i) == ' ')
                count++;
            if (count == k)
                break;
        }
        return s.substring(0,i);
    }

    public static String truncateSentence2(String s, int k) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<k; i++)
            sb.append(words[i]).append(" ");

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant",4));
    }
}
