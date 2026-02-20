import java.util.Scanner;

public class CowCheckups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt())
            return;
        int n = in.nextInt();

        int[] a = new int[n + 1];
        int[] b = new int[n + 1];

        for (int i = 1; i <= n; i++)
            a[i] = in.nextInt();
        for (int i = 1; i <= n; i++)
            b[i] = in.nextInt();

        int initialMatches = 0;
        for (int i = 1; i <= n; i++) {
            if (a[i] == b[i])
                initialMatches++;
        }

        long[] ans = new long[n + 1];

        for (int mid = 2; mid <= 2 * n; mid++) {
            int l, r;
            if (mid % 2 == 0) {
                l = mid / 2;
                r = mid / 2;
            } else {
                l = mid / 2;
                r = mid / 2 + 1;
            }

            int currentMatches = initialMatches;
            while (l >= 1 && r <= n) {
                if (a[l] == b[l])
                    currentMatches--;
                if (l != r && a[r] == b[r])
                    currentMatches--;
                if (a[l] == b[r])
                    currentMatches++;
                if (l != r && a[r] == b[l])
                    currentMatches++;

                ans[currentMatches]++;

                l--;
                r++;
            }
        }

        String sb = new String();
        for (int c = 0; c <= n; c++) {
            sb += ans[c] + "\n";
        }
        System.out.print(sb);

        in.close();
    }
}
