package problems;

public class SortingSentence {

    /**
     * A sentence is a list of words that are separated by a single space
     * with no leading or trailing spaces. Each word consists of lowercase
     * and uppercase English letters.
     * A sentence can be shuffled by appending the 1-indexed word position to each word then
     * rearranging the words in the sentence.
     * For example, the sentence "This is a sentence" can be shuffled as
     * "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
     * Given a shuffled sentence s containing no more than 9 words,
     * reconstruct and return the original sentence.
     * Example 1:
     * Input: s = "is2 sentence4 This1 a3"
     * Output: "This is a sentence"
     * Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4",
     * then remove the numbers.
     */

    public static String sortSentence(String s) {
        String[] worlds = s.split(" ");
        String[] newWorlds = new String[worlds.length];
        for (String world: worlds) {
            int i = Integer.parseInt(world.substring(world.length() - 1));
            newWorlds[i-1] = world.substring(0,world.length()-1);
        }

        StringBuilder sentence = new StringBuilder();
        for (String word: newWorlds) {
            sentence.append(word).append(" ");
        }

        return  sentence.toString().trim();
    }

    public static String sortSentence2(String s) {
        String[] words=s.split(" ");
        String[] ans = new String[words.length];
        for(String word : words){
            int i = word.length()-1;
            ans[word.charAt(i)-'1']=word.substring(0,i);
        }
        return  String.join(" ",ans);
    }

    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
