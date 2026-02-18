import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int testCases = in.nextInt();
        long[][] inputNAndD = new long[testCases][2];
        for (int i = 0; i < testCases; i++) {
            inputNAndD[i][0] = in.nextLong();
            inputNAndD[i][1] = in.nextLong();
        }

        for (int j = 0; j < testCases; j++) {

            System.out.print("1");

        }
        in.close();
    }
}
