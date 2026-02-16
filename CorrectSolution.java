
import java.util.Arrays;
import java.util.Scanner;

public class CorrectSolution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext()) {
            return;
        }
        String n = sc.next();
        if (!sc.hasNext()) {
            return;
        }
        String m = sc.next();

        String correct;

        if (n.equals("0")) {
            correct = "0";
        } else {
            char[] digits = n.toCharArray();
            Arrays.sort(digits);

            if (digits[0] == '0') {
                for (int i = 0; i < digits.length; i++) {
                    if (digits[i] != '0') {
                        char temp = digits[0];
                        digits[0] = digits[i];
                        digits[i] = temp;
                        break;
                    }
                }
            }
            correct = new String(digits);
        }

        if (correct.equals(m)) {
            System.out.println("OK");
        } else {
            System.out.println("WRONG_ANSWER");
        }

        sc.close();
    }
}
