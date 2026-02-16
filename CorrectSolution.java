
import java.util.Arrays;
import java.util.Scanner;

public class CorrectSolution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNext()) {
            return;
        }
        String n = in.next();
        if (!in.hasNext()) {
            return;
        }
        String m = in.next();

        char[] digits = n.toCharArray();
        Arrays.sort(digits);

        if (digits.length > 1 && digits[0] == '0') {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != '0') {
                    char temp = digits[0];
                    digits[0] = digits[i];
                    digits[i] = temp;
                    break;
                }
            }
        }

        String correctSmallest = new String(digits);

        if (correctSmallest.equals(m)) {
            System.out.println("OK");
        } else {
            System.out.println("WRONG_ANSWER");
        }

        in.close();
    }
}
