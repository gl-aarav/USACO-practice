import java.util.Scanner;

public class MajorityOpinion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int[] h = new int[n];

            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
            }

            boolean[] validHays = new boolean[n + 1];
            boolean foundAny = false;

            for (int i = 0; i < n; i++) {
                if (i < n - 1 && h[i] == h[i + 1]) {
                    validHays[h[i]] = true;
                }
                if (i < n - 2 && h[i] == h[i + 2]) {
                    validHays[h[i]] = true;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 1; i <= n; i++) {
                if (validHays[i]) {
                    sb.append(i).append(" ");
                    foundAny = true;
                }
            }

            if (!foundAny) {
                System.out.println("-1");
            } else {
                System.out.println(sb.toString().trim());
            }
        }

        in.close();
    }
}