import java.util.Scanner;
import java.util.ArrayList;

public class SortingGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        if (in.hasNextInt()) {
            int t = in.nextInt();

            while (t-- > 0) {
                int n = in.nextInt();
                String s = in.next();

                int totalZeros = 0;
                for (int i = 0; i < n; i++) {
                    if (s.charAt(i) == '0') {
                        totalZeros++;
                    }
                }

                ArrayList<Integer> moves = new ArrayList<>();
                for (int i = 0; i < n; i++) {
                    if (i < totalZeros) {
                        if (s.charAt(i) == '1') {
                            moves.add(i + 1);
                        }
                    } else {
                        if (s.charAt(i) == '0') {
                            moves.add(i + 1);
                        }
                    }
                }

                if (moves.isEmpty()) {
                    System.out.println("Bob");
                } else {
                    System.out.println("Alice");
                    System.out.println(moves.size());

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < moves.size(); i++) {
                        sb.append(moves.get(i));
                        if (i < moves.size() - 1) {
                            sb.append(" ");
                        }
                    }
                    System.out.println(sb);
                }
            }
        }
        in.close();
    }
}