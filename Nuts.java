
import java.util.Scanner;

public class Nuts {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int v = in.nextInt();

        int boxes = 0;
        while (a > 0) {
            int sections = 1 + Math.min(k - 1, b);
            a -= sections * v;
            b -= sections - 1;
            boxes++;
        }

        System.out.println(boxes);
    }

}
