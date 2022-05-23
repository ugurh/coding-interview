package leetcode;

public class ClarificationString {

    public static void main(String[] args) {

        int r = strStr("hello", "ll");

        System.out.println(r);
    }

    // 1 <= haystack.length, needle.length <= 104
    // haystack and needle consist of only lowercase English characters.
    public static int strStr(String haystack, String needle) {

        int l = haystack.length();
        for (int i = 0; l >= needle.length(); i++, l--) {
            String sub = haystack.substring(i, i + needle.length());
            if (sub.equals(needle))
                return i;
        }
        return -1;
    }

}
