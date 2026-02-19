import java.util.Scanner;

public class MakingMexes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sb = "";

        if (in.hasNextInt()) {
            int N = in.nextInt();
            int[] cnt = new int[N + 1];

            for (int k = 0; k < N; k++) {
                int a = in.nextInt();
                if (a <= N) {
                    cnt[a]++;
                }
            }

            int holes = 0;
            for (int i = 0; i <= N; i++) {
                int ops = Math.max(holes, cnt[i]);
                sb += ops + "\n";

                if (cnt[i] == 0) {
                    holes++;
                }
            }
        }

        System.out.println(sb);
        in.close();
    }
}