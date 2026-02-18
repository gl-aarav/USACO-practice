import java.util.Scanner;

public class MooOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int Q = in.nextInt();

            for (int i = 0; i < Q; i++) {
                String s = in.next();
                System.out.println(solve(s));
            }
        }
        in.close();
    }

    private static int solve(String s) {
        int n = s.length();

        if (n < 3) {
            return -1;
        }

        int minOps = Integer.MAX_VALUE;
        boolean possible = false;

        for (int i = 0; i <= n - 3; i++) {
            if (s.charAt(i + 1) == 'O') {
                possible = true;
                int currentOps = n - 3;
                if (s.charAt(i) != 'M') {
                    currentOps++;
                }

                if (s.charAt(i + 2) != 'O') {
                    currentOps++;
                }

                if (currentOps < minOps) {
                    minOps = currentOps;
                }
            }
        }

        if (possible) {
            return minOps;
        }
        return -1;
    }
}