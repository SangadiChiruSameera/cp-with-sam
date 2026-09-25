import java.util.*;

public class ADoNotBeDistracted {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            boolean[] seen = new boolean[26];
            boolean suspicious = false;

            for (int i = 0; i < n; i++) {

                // Start of a new task block
                if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                    int idx = str.charAt(i) - 'A';

                    // This task was already completed before
                    if (seen[idx]) {
                        suspicious = true;
                        break;
                    }

                    seen[idx] = true;
                }
            }

            System.out.println(suspicious ? "NO" : "YES");
        }

        sc.close();
    }
}