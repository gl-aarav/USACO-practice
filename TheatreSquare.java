import java.util.Scanner;

public class TheatreSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        long n = in.nextLong();
        long m = in.nextLong();
        long a = in.nextLong();

        long x = (n + a - 1) / a;
        long y = (m + a - 1) / a;

        long result = x * y;
        System.out.println("\n" + result);

        in.close();
    }
}
