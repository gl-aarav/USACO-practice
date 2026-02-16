import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String target = "hello";
        int j = 0;

        for (int i = 0; i < s.length() && j < target.length(); i++) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
        }

        if (j == target.length()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        in.close();
    }
}
