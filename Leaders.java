import java.util.*;

public class Leaders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String breeds = in.next();
        int[] E = new int[N];
        for (int i = 0; i < N; i++) {
            E[i] = in.nextInt() - 1;
        }

        int firstG = -1, lastG = -1;
        int firstH = -1, lastH = -1;

        for (int i = 0; i < N; i++) {
            if (breeds.charAt(i) == 'G') {
                if (firstG == -1)
                    firstG = i;
                lastG = i;
            } else {
                if (firstH == -1)
                    firstH = i;
                lastH = i;
            }
        }

        long ans = 0;

        boolean gLeader = (firstG != -1 && E[firstG] >= lastG);
        boolean hLeader = (firstH != -1 && E[firstH] >= lastH);

        if (gLeader && hLeader) {
            ans++;
        }

        if (hLeader) {
            for (int i = 0; i < firstH; i++) {
                if (i == firstG)
                    continue;
                if (breeds.charAt(i) == 'G' && E[i] >= firstH) {
                    ans++;
                }
            }
        }

        if (gLeader) {
            for (int i = 0; i < firstG; i++) {
                if (i == firstH)
                    continue;
                if (breeds.charAt(i) == 'H' && E[i] >= firstG) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}