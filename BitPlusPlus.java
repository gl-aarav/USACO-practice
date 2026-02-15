import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt(); // number of statements
        int x = 0; // initial value of x is 0

        for (int i = 0; i < n; i++) {
            String statement = in.next(); // read the whole statement, e.g. "++X" or "X--"

            if (statement.contains("++")) {
                x++;
            } else if (statement.contains("--")) {
                x--;
            }
        }

        System.out.println(x);
        in.close();

    }
}
