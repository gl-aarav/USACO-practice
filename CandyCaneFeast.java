
/**
 * We have N cows of various heights in a Line
 * who take turns eating M candy canes. Every time a cow
 * eats a candy cane, they grow by the amount they ate.
 * 
 * Print the final height of all the cows.
 * 
 * @author Aarav Goyal
 * @since Feb 14, 2026
 */

import java.util.Scanner;

public class CandyCaneFeast {

    /**
     * Main Method to execute printFinalHeights() method
     * 
     * @param args
     */
    public static void main(String[] args) {
        CandyCaneFeast ccf = new CandyCaneFeast();
        ccf.printFinalHeights();
    }

    /**
     * Prints final Heights of all three cows
     */
    public void printFinalHeights() {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();

        int[] cows = new int[N];
        int[] candycanes = new int[M];

        for (int n = 0; n < N; n++) {
            cows[n] = in.nextInt();
        }

        for (int m = 0; m < M; m++) {
            candycanes[m] = in.nextInt();
        }

        System.out.println(
                "Cows: " + N + " Candy Canes: " + M + "\nCow heights: " + cows + "\nCandy Cane Heights: " + candycanes);
        for (int i = 0; i < N; i++) {
            int candyEaten = 0;
            for (int j = 0; j < M; j++) {
                int eats = Math.min(candycanes[i], cows[i]) - candyEaten;
                if (eats <= 0) {
                    continue;
                }
                cows[j] += eats;
                candyEaten += eats;
                if (candyEaten == candycanes[i]) {
                    break;
                }
            }
        }

        System.out.println(
                "Cows: " + N + " Candy Canes: " + M + "\nCow heights: " + cows + "\nCandy Cane Heights: " + candycanes);
        in.close();
    }
}