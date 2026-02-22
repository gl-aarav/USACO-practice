import java.util.Scanner;

public class HugePile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();

            System.out.println(solve(n, k));
        }
        in.close();
    }

    private static long solve(long n, long k) {
        if (n == k)
            return 0;
        if (k > n)
            return -1;

        long minVal = n;
        long maxVal = n;
        int minutes = 0;

        while (maxVal >= k) {
            minutes++;

            long nextMin = minVal / 2;
            long nextMax = (maxVal + 1) / 2;
            if (k >= nextMin && k <= nextMax) {
                return minutes;
            }

            minVal = nextMin;
            maxVal = nextMax;

            if (maxVal < k)
                break;
        }

        return -1;
    }
}