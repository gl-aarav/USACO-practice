import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M = in.nextInt();
        int N = in.nextInt();

        int maxDominoes = (M * N) / 2;

        System.out.println(maxDominoes);

        in.close();
    }
}
