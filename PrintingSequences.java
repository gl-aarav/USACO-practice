import java.util.Scanner;

public class PrintingSequences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int T = in.nextInt();
            while (T-- > 0) {
                solve(in);
            }
        }
    }

    private static void solve(Scanner in) {
        int N = in.nextInt();
        int K = in.nextInt();

        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }

        int[][] dp = new int[N][N];

        for (int len = 1; len <= N; len++) {
            for (int i = 0; i <= N - len; i++) {
                int j = i + len - 1;

                if (len == 1) {
                    dp[i][j] = 1;
                    continue;
                }

                dp[i][j] = 1000;
                for (int k = i; k < j; k++) {
                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + dp[k + 1][j]);
                }
                for (int pLen = 1; pLen <= len / 2; pLen++) {
                    if (len % pLen == 0) {
                        boolean match = true;
                        for (int k = pLen; k < len; k++) {
                            if (A[i + k] != A[i + (k % pLen)]) {
                                match = false;
                                break;
                            }
                        }

                        if (match) {
                            dp[i][j] = Math.min(dp[i][j], dp[i][i + pLen - 1]);
                        }
                    }
                }
            }
        }

        if (dp[0][N - 1] <= K) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}