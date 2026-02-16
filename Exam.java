
import java.util.*;

public class Exam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt()) {
            return;
        }
        int n = in.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
            System.out.println(1);
        } else if (n == 3) {
            System.out.println(2);
            System.out.println("1 3");
        } else if (n == 4) {
            System.out.println(4);
            System.out.println("2 4 1 3");
        } else {

            StringBuilder sb = new StringBuilder();
            System.out.println(n);

            for (int i = n; i >= 1; i--) {
                if (i % 2 != 0) {
                    sb.append(i).append(" ");
                }
            }
            for (int i = n; i >= 1; i--) {
                if (i % 2 == 0) {
                    sb.append(i).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
        in.close();
    }

}
