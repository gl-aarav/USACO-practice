import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i = 0; i < n; i++) {
            String word = in.next();

            if (word.length() > 10) {
                int middleCount = word.length() - 2;
                char first = word.charAt(0);
                char last = word.charAt(word.length() - 1);
                System.out.println("" + first + middleCount + last);
            } else {
                System.out.println(word);
            }
        }

        in.close();
    }
}
