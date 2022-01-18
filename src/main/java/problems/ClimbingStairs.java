package problems;

public class ClimbingStairs {
    // Each time you can either climb 1 or 2 steps.
    // In how many distinct ways can you climb to the top?

    public static int climbStairs(int n) {
        return climb_Stairs(0, n);
    }
    public static int climb_Stairs(int i, int n) {
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }

        System.out.println("i:" +i + ", n:" + n);
        return climb_Stairs(i + 1, n) + climb_Stairs(i + 2, n);
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
}
