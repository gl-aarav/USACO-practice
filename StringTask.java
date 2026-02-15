import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        in.close();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'O' || ch == 'Y' || ch == 'E' || ch == 'U' || ch == 'I' ||
                    ch == 'a' || ch == 'o' || ch == 'y' || ch == 'e' || ch == 'u' || ch == 'i') {
                continue;
            }
            System.out.print("." + Character.toLowerCase(ch));
        }
    }
}
