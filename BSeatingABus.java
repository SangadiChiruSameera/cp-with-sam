
import java.util.*;

public class BSeatingInABus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            boolean[] occupied = new boolean[n + 2];
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                int seat = sc.nextInt();

                if (i == 0) {
                    occupied[seat] = true;
                    continue;
                }

                // Check whether at least one neighbor is occupied
                if (!occupied[seat - 1] && !occupied[seat + 1]) {
                    possible = false;
                }

                occupied[seat] = true;
            }

            System.out.println(possible ? "YES" : "NO");
        }

        sc.close();
    }
}
