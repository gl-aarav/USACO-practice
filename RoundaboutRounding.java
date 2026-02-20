import java.util.Scanner;

public class RoundaboutRounding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        StringBuilder out = new StringBuilder();

        for (int i = 0; i < T; i++) {
            long N = in.nextLong();
            out.append(solve(N)).append("\n");
        }

        System.out.print(out.toString());
        in.close();
    }

    private static long solve(long N) {
        if (N < 45) {
            return 0;
        }

        String s = String.valueOf(N);
        int L = s.length();
        long ans = 0;

        long currentFives = 5;
        for (int k = 2; k < L; k++) {
            ans += currentFives;
            currentFives = currentFives * 10 + 5;
        }

        long T_L = 0;
        for (int i = 0; i < L - 1; i++) {
            T_L = T_L * 10 + 4;
        }
        T_L = T_L * 10 + 5;

        long max_val = 5;
        for (int i = 1; i < L; i++) {
            max_val *= 10;
        }
        max_val -= 1;

        long valid_max = Math.min(N, max_val);

        if (valid_max >= T_L) {
            ans += (valid_max - T_L + 1);
        }

        return ans;
    }
}