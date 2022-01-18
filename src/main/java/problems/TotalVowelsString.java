package problems;

public class TotalVowelsString {

    // counts the number of vowels in a string
    public static int totalVowels(String text, int len, int index) {
        int count = 0;

        if (len == 0) {
            return 0;
        }
        char single = Character.toUpperCase(text.charAt(index));
        if (single == 'A' || single == 'E' || single == 'I' || single == 'O' || single == 'U') {
            count++;
        }
        return count + totalVowels(text, len - 1, index + 1);
    }

    public static void main(String[] args) {
        String text = "thisisrecursion";
        int cnt = 0;
        cnt = totalVowels(text, text.length(), 0);
        System.out.println(cnt);
    }
}
