import java.util.*;

public class AstralSuperPosition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt())
            return;
        int T = in.nextInt();

        while (T-- > 0) {
            int N = in.nextInt();
            int A = in.nextInt();
            int B = in.nextInt();

            int[][] grid = new int[N][N];
            for (int i = 0; i < N; i++) {
                String row = in.next();
                for (int j = 0; j < N; j++) {
                    char c = row.charAt(j);
                    if (c == 'W')
                        grid[i][j] = 0;
                    else if (c == 'G')
                        grid[i][j] = 1;
                    else if (c == 'B')
                        grid[i][j] = 2;
                }
            }

            int[][] firstPhoto = new int[N][N];
            long totalStars = 0;
            boolean possible = true;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    int secondPhotoContribution = 0;
                    if (i >= B && j >= A) {
                        secondPhotoContribution = firstPhoto[i - B][j - A];
                    }
                    int currentFirst = grid[i][j] - secondPhotoContribution;

                    if (currentFirst < 0 || currentFirst > 1) {
                        possible = false;
                        break;
                    }

                    firstPhoto[i][j] = currentFirst;
                    if (currentFirst == 1)
                        totalStars++;
                }
                if (!possible)
                    break;
            }

            if (possible) {
                System.out.println(totalStars);
            } else {
                System.out.println(-1);
            }
        }
    }
}