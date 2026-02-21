import java.util.Scanner;

public class BalancingBacteria {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt())
            return;
        int n = in.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextLong();
        }

        long totalApplications = 0;
        long s = 0;
        long v = 0;

        for (int i = 0; i < n; i++) {
            long currentLevel = a[i] + s;

            long x = -currentLevel;

            totalApplications += Math.abs(x);
            v += x;

            s += (v + x);
        }

        System.out.println(totalApplications);

        in.close();
    }
}