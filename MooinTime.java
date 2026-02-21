import java.util.Scanner;

public class MooinTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        if (!in.hasNextInt())
            return;

        int N = in.nextInt();
        int F = in.nextInt();
        String s = in.next();

        int[][] counts = new int[26][26];
        for (int i = 0; i <= N - 3; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            char c3 = s.charAt(i + 2);
            if (c1 != c2 && c2 == c3) {
                counts[c1 - 'a'][c2 - 'a']++;
            }
        }

        boolean[][] isValid = new boolean[26][26];
        int totalValid = 0;

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == j)
                    continue;

                if (counts[i][j] >= F) {
                    isValid[i][j] = true;
                    totalValid++;
                } else if (counts[i][j] == F - 1) {
                    if (canMakeOneMore(s, (char) ('a' + i), (char) ('a' + j))) {
                        isValid[i][j] = true;
                        totalValid++;
                    }
                }
            }
        }

        System.out.println(totalValid);
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (isValid[i][j]) {
                    char c1 = (char) ('a' + i);
                    char c2 = (char) ('a' + j);
                    System.out.println("" + c1 + c2 + c2);
                }
            }
        }
    }

    private static boolean canMakeOneMore(String s, char targetI, char targetJ) {
        for (int k = 0; k <= s.length() - 3; k++) {
            char s1 = s.charAt(k);
            char s2 = s.charAt(k + 1);
            char s3 = s.charAt(k + 2);

            if (!(s1 == targetI && s2 == targetJ && s3 == targetJ)) {
                int diffs = 0;
                if (s1 != targetI)
                    diffs++;
                if (s2 != targetJ)
                    diffs++;
                if (s3 != targetJ)
                    diffs++;

                if (diffs == 1)
                    return true;
            }
        }
        return false;
    }
}