import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Seats {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int t = in.nextInt();
            while (t-- > 0) {
                int n = in.nextInt();
                String s = in.next();

                List<Integer> pos = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '1') {
                        pos.add(i);
                    }
                }

                if (pos.isEmpty()) {
                    System.out.println((long) (n + 2) / 3);
                } else {
                    long totalStudents = pos.size();

                    int firstZeroCount = pos.get(0);
                    totalStudents += (long) (firstZeroCount + 1) / 3;

                    for (int i = 0; i < pos.size() - 1; i++) {
                        int midZeroCount = pos.get(i + 1) - pos.get(i) - 1;
                        totalStudents += (long) midZeroCount / 3;
                    }

                    int lastZeroCount = n - 1 - pos.get(pos.size() - 1);
                    totalStudents += (long) (lastZeroCount + 1) / 3;

                    System.out.println(totalStudents);
                }
            }
        }
        in.close();
    }
}