
import java.util.Scanner;

public class Divisibility {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long lcm = 2520L;
        System.out.println(n / lcm);

        in.close();
    }
}
