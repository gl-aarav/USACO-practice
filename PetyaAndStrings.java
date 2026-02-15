
// Main.java
import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();
        in.close();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int result = s1.compareTo(s2);

        if (result < 0) {
            System.out.println(-1);
        } else if (result > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
