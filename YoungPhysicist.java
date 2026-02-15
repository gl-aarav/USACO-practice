import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sumX = 0, sumY = 0, sumZ = 0;

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            sumX += x;
            sumY += y;
            sumZ += z;
        }

        if (sumX == 0 && sumY == 0 && sumZ == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}