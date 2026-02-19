import java.util.*;

/**
 * Problem: Digits
 * Given integers n and d, consider the integer X formed by repeating the digit d, n! times.
 * Determine which of the digits 1, 3, 5, 7, 9 divide X.
 */
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt())
            return;
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            int d = sc.nextInt();

            ArrayList<Integer> result = new ArrayList<>();
            // 1 always divides any integer.
            result.add(1);

            // 3 divides X if the sum of digits is divisible by 3.
            // Sum of digits = d * n!.
            // Divisible by 3 if d is divisible by 3 OR n! is divisible by 3 (n >= 3).
            if (n >= 3 || (d % 3 == 0)) {
                result.add(3);
            }

            // 5 divides X if the last digit is 0 or 5.
            // Since d is a digit from 1-9 (usually), X ends in d.
            // So X is divisible by 5 iff d == 5.
            if (d == 5) {
                result.add(5);
            }

            // 7 divides X if the number of repetitions (n!) is a multiple of 6 (period of 1/7).
            // n! is a multiple of 6 if n >= 3.
            // OR if d is 7, then X is 77...7 which is always divisible by 7.
            if (n >= 3 || d == 7) {
                result.add(7);
            }

            // 9 divides X if the sum of digits is divisible by 9.
            // Sum of digits = d * n!.
            // Divisible by 9 if:
            // 1. n! is divisible by 9 (n >= 6).
            // 2. d is divisible by 3 AND n! is divisible by 3 (n >= 3).
            // 3. d is divisible by 9.
            if (n >= 6 || (n >= 3 && d % 3 == 0) || (d % 9 == 0)) {
                result.add(9);
            }

            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
            }
            System.out.println();
        }
        sc.close();
    }
}
