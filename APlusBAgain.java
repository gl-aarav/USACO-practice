import java.util.Scanner;

public class APlusBAgain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();

        int[] numbersToSumDigits = new int[count];
        for (int i = 0; i < count; i++) {
            numbersToSumDigits[i] = in.nextInt();
        }

        for (int i = 0; i < count; i++) {
            int sum = 0;
            int num = numbersToSumDigits[i];
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        }
    }
}
