import java.util.Scanner;

public class MooOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (!in.hasNextInt())
            return;
        int Q = in.nextInt();

        while (Q-- > 0) {
            String s = in.next();
            int n = s.length();
            int minOps = Integer.MAX_VALUE;

            for (int i = 0; i <= n - 3; i++) {
                String sub = s.substring(i, i + 3);

                if (sub.charAt(1) == 'O') {
                    int replacements = 0;

                    if (sub.charAt(0) != 'M')
                        replacements++;
                    if (sub.charAt(2) != 'O')
                        replacements++;

                    int currentOps = (n - 3) + replacements;
                    minOps = Math.min(minOps, currentOps);
                }
            }

            if (minOps == Integer.MAX_VALUE) {
                System.out.println("-1");
            } else {
                System.out.println(minOps);
            }
        }
        in.close();
    }
}