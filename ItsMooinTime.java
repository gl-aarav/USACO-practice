import java.util.Arrays;
import java.util.Scanner;

public class ItsMooinTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int[] a = new int[N];

        int[] frequency = new int[N + 1];
        for (int i = 0; i < N; i++) {
            a[i] = in.nextInt();
            frequency[a[i]]++;
        }

        int[] seenCount = new int[N + 1];
        boolean[] firstOccurrence = new boolean[N + 1];
        Arrays.fill(firstOccurrence, true);

        long totalMoos = 0;
        int validBCount = 0;

        for (int i = 1; i <= N; i++) {
            if (frequency[i] >= 2) {
                validBCount++;
            }
        }

        for (int i = 0; i < N; i++) {
            int current = a[i];

            seenCount[current]++;
            if (frequency[current] - seenCount[current] < 2 && frequency[current] >= 2) {
                if (frequency[current] - (seenCount[current] - 1) >= 2) {
                    validBCount--;
                }
            }

            if (firstOccurrence[current]) {
                firstOccurrence[current] = false;

                int moosForThisA = validBCount;
                if (frequency[current] - seenCount[current] >= 2) {
                    moosForThisA--;
                }

                totalMoos += Math.max(0, moosForThisA);
            }
        }

        System.out.println(totalMoos);
        in.close();
    }
}
