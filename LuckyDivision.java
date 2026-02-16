import java.util.ArrayList;
import java.util.Scanner;

public class LuckyDivision {

    private static void generateLuckyNumbers(long current, ArrayList<Integer> lucky) {
        if (current > 1000) {
            return;
        }
        if (current != 0) {
            lucky.add((int) current);
        }

        generateLuckyNumbers(current * 10 + 4, lucky);
        generateLuckyNumbers(current * 10 + 7, lucky);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList<Integer> lucky = new ArrayList<>();
        generateLuckyNumbers(0, lucky);

        boolean almostLucky = false;
        for (int x : lucky) {
            if (n % x == 0) {
                almostLucky = true;
                break;
            }
        }

        if (almostLucky) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}
