import java.util.Scanner;

public class CheeseBlock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int Q = sc.nextInt();

        int[][] countX = new int[N][N];
        int[][] countY = new int[N][N];
        int[][] countZ = new int[N][N];

        int totalBricks = 0;

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            countX[y][z]++;
            if (countX[y][z] == N) {
                totalBricks++;
            }

            countY[x][z]++;
            if (countY[x][z] == N) {
                totalBricks++;
            }

            countZ[x][y]++;
            if (countZ[x][y] == N) {
                totalBricks++;
            }

            out.append(totalBricks).append("\n");
        }

        System.out.print(out);
        sc.close();
    }
}