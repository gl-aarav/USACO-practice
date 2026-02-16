import java.util.Scanner;

public class CapsLock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        if (shouldToggle(s)) {
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c)) {
                    result.append(Character.toUpperCase(c));
                } else {
                    result.append(Character.toLowerCase(c));
                }
            }
            System.out.println(result.toString());
        } else {
            System.out.println(s);
        }
    }

    private static boolean shouldToggle(String s) {

        boolean allUpper = true;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                allUpper = false;
                break;
            }
        }
        if (allUpper)
            return true;

        boolean restUpper = true;
        for (int i = 1; i < s.length(); i++) {
            if (!Character.isUpperCase(s.charAt(i))) {
                restUpper = false;
                break;
            }
        }
        return restUpper;

    }
}
