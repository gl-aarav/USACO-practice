import java.util.Scanner;

public class TableWithNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (in.hasNextInt()) {
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                int h = in.nextInt();
                int l = in.nextInt();

                int rowsPossible = 0;
                int colsPossible = 0;

                for (int i = 0; i < n; i++) {
                    int a = in.nextInt();
                    if (a <= h) {
                        rowsPossible++;
                    }
                    if (a <= l) {
                        colsPossible++;
                    }
                }

                int maxPairs = Math.min(rowsPossible, Math.min(colsPossible, n / 2));

                System.out.println(maxPairs);
            }
        }
        in.close();
    }
}