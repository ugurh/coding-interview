package problems;

/**
 * What is GCD?#
 * The GCD of two integers is the largest integer that can fully divide both numbers, without a remainder.
 * <p>
 * How to find GCD?#
 * What is the greatest common divisor of 54 and 36?
 * <p>
 * The number 3636 can be expressed as a product of two integers in several different ways:
 * <p>
 * 36\times 1=18\times 2= 12\times 3 = 9\times 436×1=18×2=12×3=9×4
 * <p>
 * Thus the divisors for 3636 are 1, 2, 3, 4, 6, 9, 12, 18, 361,2,3,4,6,9,12,18,36
 * <p>
 * The number 5454 can be expressed as a product of two integers in several different ways:
 * <p>
 * 54\times 1=27\times 2= 18\times 3=9\times 654×1=27×2=18×3=9×6
 * <p>
 * Thus the divisors for 5454 are 1, 2, 3, 6, 9, 18, 271,2,3,6,9,18,27
 * <p>
 * Common divisors are 1, 2, 3, 6, 91,2,3,6,9 and 1818.
 * <p>
 * The greatest common divisor or GCD for 36 and 54 is 18
 */
public class GreatestCommonDivisor {

    static int gcd(int x, int y) {
        if (x == y) return x;
        else if (x < y) return gcd(x, y - x);
        else return gcd(x - y, y);
    }

    public static void main(String args[]) {
        int x = 56;
        int y = 42;
        int result = gcd(x, y);
        System.out.println("The GCD of " + x + " and " + y + " is:" + result);
    }
}
