import java.util.*;

public class CannonBall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();

        int[] q = new int[n + 1];
        int[] v = new int[n + 1];
        boolean[] broken = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            q[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        int currentPos = s;
        int power = 1;
        int direction = 1;
        int brokenCount = 0;

        for (int iter = 0; iter < 10000000; iter++) {
            if (currentPos < 1 || currentPos > n) {
                break;
            }

            if (q[currentPos] == 0) {
                power += v[currentPos];
                direction *= -1;
            } else {
                if (!broken[currentPos] && power >= v[currentPos]) {
                    broken[currentPos] = true;
                    brokenCount++;
                }
            }

            currentPos += direction * power;
        }

        System.out.println(brokenCount);
        sc.close();
    }
}