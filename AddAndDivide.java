import java.util.Scanner;
import java.util.ArrayList;

public class AddAndDivide {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        ArrayList<Integer> answers = new ArrayList<>();

        while (t-- > 0) {
            long a = in.nextLong();
            int b = in.nextInt();

            int ans = Integer.MAX_VALUE;

            for (int inc = 0; inc <= 60; inc++) {
                int curB = b + inc;
                if (curB == 1)
                    continue;

                long x = a;
                int ops = inc;
                while (x > 0) {
                    x /= curB;
                    ops++;
                }
                if (ops < ans)
                    ans = ops;
            }

            answers.add(ans);
        }

        for (int i = 0; i < answers.size(); i++) {
            System.out.println(answers.get(i));
        }
    }
}
