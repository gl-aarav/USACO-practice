import java.util.Scanner;

public class YetAnotherMEXProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int t = in.nextInt();
            while (t-- > 0) {
                solve(in);
            }
        }
    }

    private static void solve(Scanner sc) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int maxMex = 0;
        for (int i = 0; i <= n - k; i++) {
            int[] counts = new int[n + 1];
            for (int j = i; j < i + k; j++) {
                counts[a[j]]++;
            }
            int mex = 0;
            while (counts[mex] > 0) {
                mex++;
            }
            maxMex = Math.max(maxMex, mex);
        }
        System.out.println(Math.min(k, maxMex));
    }
}