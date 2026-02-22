import java.util.Scanner;

public class AirCownditioning {
    static int N, M;
    static int[] s, t, c;
    static int[] a, b, p, m;
    static int minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt())
            return;
        N = in.nextInt();
        M = in.nextInt();

        s = new int[N];
        t = new int[N];
        c = new int[N];
        for (int i = 0; i < N; i++) {
            s[i] = in.nextInt();
            t[i] = in.nextInt();
            c[i] = in.nextInt();
        }

        a = new int[M];
        b = new int[M];
        p = new int[M];
        m = new int[M];
        for (int i = 0; i < M; i++) {
            a[i] = in.nextInt();
            b[i] = in.nextInt();
            p[i] = in.nextInt();
            m[i] = in.nextInt();
        }

        solve(0, new boolean[M]);

        System.out.println(minCost);
    }

    static void solve(int index, boolean[] selected) {
        if (index == M) {
            if (isValid(selected)) {
                int currentCost = 0;
                for (int i = 0; i < M; i++) {
                    if (selected[i])
                        currentCost += m[i];
                }
                minCost = Math.min(minCost, currentCost);
            }
            return;
        }

        selected[index] = false;
        solve(index + 1, selected);

        selected[index] = true;
        solve(index + 1, selected);
    }

    static boolean isValid(boolean[] selected) {
        int[] cooling = new int[101];

        for (int i = 0; i < M; i++) {
            if (selected[i]) {
                for (int stall = a[i]; stall <= b[i]; stall++) {
                    cooling[stall] += p[i];
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int stall = s[i]; stall <= t[i]; stall++) {
                if (cooling[stall] < c[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}