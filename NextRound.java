import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int threshold = a[k - 1];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (a[i] >= threshold && a[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
        in.close();
    }
}
