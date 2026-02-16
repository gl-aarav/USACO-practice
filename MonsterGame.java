
import java.util.Arrays;
import java.util.Scanner;

public class MonsterGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) {
            return;
        }
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);

            long[] prefB = new long[n + 1];
            for (int i = 0; i < n; i++) {
                prefB[i + 1] = prefB[i] + b[i];
            }

            long maxScore = 0;

            for (int i = 0; i < n; i++) {
                if (i > 0 && a[i] == a[i - 1]) {
                    continue;
                }

                long x = a[i];
                int numSwords = n - i;
                int levelsCompleted = upperBound(prefB, numSwords) - 1;

                long currentScore = x * levelsCompleted;
                if (currentScore > maxScore) {
                    maxScore = currentScore;
                }
            }

            System.out.println(maxScore);
        }
        sc.close();
    }

    private static int upperBound(long[] arr, long target) {
        int low = 0, high = arr.length;
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] <= target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }
}
