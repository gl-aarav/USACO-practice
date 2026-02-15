
/**
 * USACO December 2023 Problem 2
 * 
 * Infected Cows
 * 
 * @author Aarav Goyal
 * @since Feb 14, 2026
 */

import java.util.Scanner;
import java.util.ArrayList;

public class InfectedCows {

    public static void main(String[] args) {
        InfectedCows ic = new InfectedCows();
        ic.findMinCows();
    }

    public void findMinCows() {
        Scanner in = new Scanner(System.in);
        int cows = in.nextInt();
        String endCowPostion = in.next();
        int maxDays = 0;
        ArrayList<Integer> intervalLengths = new ArrayList<Integer>();

        int count = 0;
        for (int i = 0; i < cows; i++) {
            if (endCowPostion.charAt(i) == '0' && count > 0) {
                intervalLengths.add(count);
                count = 0;
            } else if (endCowPostion.charAt(i) == '1') {
                count++;
            }
        }

        if (count > 0) {
            intervalLengths.add(count);
        }

        int L = intervalLengths.size();

        char leftZero = endCowPostion.charAt(0);
        char rightZero = endCowPostion.charAt(endCowPostion.length() - 1);
        maxDays = Math.min(intervalLengths.get(0), intervalLengths.get(L - 1)) - 1;

        if (leftZero == '0') {
            maxDays = Math.max(maxDays, (intervalLengths.get(0) - 1) / 2);
        }
        if (rightZero == '0') {
            maxDays = Math.max(maxDays, (intervalLengths.get(L - 1) - 1) / 2);
        }

        for (int i = 1; i < L - 1; i++) {
            maxDays = Math.min(maxDays, (intervalLengths.get(i) - 1) / 2);
        }

        int counter = 0;
        for (int i = 0; i < L; i++) {
            counter += Math.ceil(intervalLengths.get(i) / (double) (2 * maxDays - 1));
        }

        System.out.println(counter);

        in.close();
    }

}
