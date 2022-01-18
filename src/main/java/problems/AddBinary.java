package problems;

public class AddBinary {

    static String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0) {
            if (i >= 0) {
                carry += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                carry += b.charAt(j) - '0';
                j--;
            }
            sb.append(carry % 2);
            carry /= 2;
        }
        if (carry > 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }


    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
        String a = "1010";
        char x = a.charAt(0);
        int y = a.charAt(0) - '0';
        System.out.println(a.charAt(0) - '0');
    }
}
