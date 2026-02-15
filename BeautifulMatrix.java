
import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int oneRow = -1;
        int oneCol = -1;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                int val = in.nextInt();
                if (val == 1) {
                    oneRow = i;
                    oneCol = j;
                }
            }
        }

        int moves = Math.abs(oneRow - 3) + Math.abs(oneCol - 3);
        System.out.println(moves);

        in.close();
    }
}
