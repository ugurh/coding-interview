package problems;

public class Sqrt {

    public static int mySqrt(int x) {
        if (x == 0) return 0;

        long left = 1;
        long right = x;
        long mid;

        while (left <= right) {
            mid = (left + right) / 2;

            if ((mid * mid) == x) {
                return (int) mid;
            } else {
                if (mid * mid > x) {
                    right = mid - 1;
                } else if (mid * mid < x) {
                    left = mid + 1;
                }
            }
        }
        mid = (right + left) / 2;
        return (int) mid;
    }

    public static void main(String[] args) {
        System.out.println(mySqrt(49));
    }
}
