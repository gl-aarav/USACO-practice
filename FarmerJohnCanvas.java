import java.util.Scanner;

public class FarmerJohnCanvas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int U = in.nextInt();

        boolean[][] grid = new boolean[N][N];
        int[][] groupCounts = new int[N / 2][N / 2];

        for (int i = 0; i < N; i++) {
            String row = in.next();
            for (int j = 0; j < N; j++) {
                if (row.charAt(j) == '#') {
                    grid[i][j] = true;

                    int r;
                    if (i < N / 2) {
                        r = i;
                    } else {
                        r = N - 1 - i;
                    }

                    int c;
                    if (j < N / 2) {
                        c = j;
                    } else {
                        c = N - 1 - j;
                    }

                    groupCounts[r][c]++;
                }
            }
        }

        long totalCost = 0;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N / 2; j++) {
                int k = groupCounts[i][j];
                totalCost += Math.min(k, 4 - k);
            }
        }

        System.out.println(totalCost);

        for (int i = 0; i < U; i++) {
            int rIn = in.nextInt() - 1;
            int cIn = in.nextInt() - 1;

            int rGroup;
            if (rIn < N / 2) {
                rGroup = rIn;
            } else {
                rGroup = N - 1 - rIn;
            }

            int cGroup;
            if (cIn < N / 2) {
                cGroup = cIn;
            } else {
                cGroup = N - 1 - cIn;
            }

            int oldK = groupCounts[rGroup][cGroup];
            totalCost -= Math.min(oldK, 4 - oldK);

            if (grid[rIn][cIn]) {
                grid[rIn][cIn] = false;
                groupCounts[rGroup][cGroup]--;
            } else {
                grid[rIn][cIn] = true;
                groupCounts[rGroup][cGroup]++;
            }
            int newK = groupCounts[rGroup][cGroup];
            totalCost += Math.min(newK, 4 - newK);

            System.out.println(totalCost);
        }

        in.close();
    }
}