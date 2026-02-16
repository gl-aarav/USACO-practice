
import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int ans = Integer.MIN_VALUE;

        ans = Math.max(ans, a + b + c);
        ans = Math.max(ans, a * b * c);
        ans = Math.max(ans, (a + b) * c);
        ans = Math.max(ans, a * (b + c));

        System.out.println(ans);
    }
}