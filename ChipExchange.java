import java.util.Scanner;

public class ChipExchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt())
            return;
        int T = in.nextInt();

        while (T-- > 0) {
            long A = in.nextLong();
            long B = in.nextLong();
            long cA = in.nextLong();
            long cB = in.nextLong();
            long fA = in.nextLong();

            if (A >= fA) {
                System.out.println(0);
                continue;
            }
            long neededA = fA - A;

            long ops = (neededA + cA - 1) / cA;

            long totalBRequired = ops * cB;
            if (B >= totalBRequired) {
                System.out.println(0);
            } else {
                System.out.println(totalBRequired - B);
            }
        }

        in.close();
    }
}