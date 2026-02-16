
import java.util.Scanner;

public class Square {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int t = in.nextInt();

            while (t-- > 0) {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = in.nextInt();
                int d = in.nextInt();

                if (a == b && b == c && c == d) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        in.close();
    }
}
