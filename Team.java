import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            int v = in.nextInt();
            int t = in.nextInt();

            int sure = p + v + t;

            if (sure >= 2) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}