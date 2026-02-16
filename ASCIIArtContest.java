
import java.util.Arrays;
import java.util.Scanner;

public class ASCIIArtContest {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int g = in.nextInt();
            int c = in.nextInt();
            int l = in.nextInt();

            int[] scores = {g, c, l};
            Arrays.sort(scores);

            int minScore = scores[0];
            int medianScore = scores[1];
            int maxScore = scores[2];

            if ((maxScore - minScore) >= 10) {
                System.out.println("check again");
            } else {
                System.out.println("final " + medianScore);
            }
        }
        in.close();
    }
}
