package hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class JavaBigDecimal {

    public static void main(String[] args) {

        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }

        //Write your code here
        Arrays.sort(s, (s1, s2) -> new BigDecimal(s2).compareTo(new BigDecimal(s1)));


    }
}
