package hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger x = scanner.nextBigInteger();
        BigInteger y = scanner.nextBigInteger();

        BigInteger s = x.add(y);

        System.out.println(s);
    }
}
