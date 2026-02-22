import java.util.Scanner;
import java.util.ArrayList;

public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            int d = sc.nextInt();

            ArrayList<Integer> result = new ArrayList<>();
            result.add(1);

            if (n >= 3 || (d % 3 == 0)) {
                result.add(3);
            }

            if (d == 5) {
                result.add(5);
            }

            if (n >= 3 || d == 7) {
                result.add(7);
            }

            if (n >= 6 || (n >= 3 && d % 3 == 0) || (d % 9 == 0)) {
                result.add(9);
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}