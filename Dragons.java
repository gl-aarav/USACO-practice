import java.util.Arrays;
import java.util.Scanner;

public class Dragons {

    private static class Dragon implements Comparable<Dragon> {
        int strength;
        int bonus;

        Dragon(int strength, int bonus) {
            this.strength = strength;
            this.bonus = bonus;
        }

        public int compareTo(Dragon other) {
            return Integer.compare(this.strength, other.strength);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int n = sc.nextInt();

        Dragon[] dragons = new Dragon[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            dragons[i] = new Dragon(x, y);
        }

        sc.close();

        Arrays.sort(dragons);

        for (Dragon d : dragons) {
            if (s <= d.strength) {
                System.out.println("NO");
                return;
            }
            s += d.bonus;
        }

        System.out.println("YES");
    }
}
