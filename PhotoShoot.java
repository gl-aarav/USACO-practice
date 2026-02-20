
/**
 * @author Aarav Goyal
 * @since 2026-02-20
 */

import java.util.Scanner;

public class PhotoShoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();

        long[][] grid = new long[n + 1][n + 1];

        long[][] sum = new long[n + 1][n + 1];

        long currentMax = 0;

        for (int i = 0; i < q; i++) {
            int r = in.nextInt();
            int c = in.nextInt();
            long v = in.nextLong();

            long delta = v - grid[r][c];
            grid[r][c] = v;

            int startRow = Math.max(1, r - k + 1);
            int endRow = Math.min(n - k + 1, r);
            int startCol = Math.max(1, c - k + 1);
            int endCol = Math.min(n - k + 1, c);

            for (int row = startRow; row <= endRow; row++) {
                for (int col = startCol; col <= endCol; col++) {
                    sum[row][col] += delta;
                    if (sum[row][col] > currentMax) {
                        currentMax = sum[row][col];
                    }
                }
            }

            System.out.println(currentMax);
        }

        in.close();
    }
}
