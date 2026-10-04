import java.util.*;

public class AProblemsolvingLog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            int[] freq = new int[26];

            for (char ch : str.toCharArray()) {
                freq[ch - 'A']++;
            }

            int count = 0;

            for (int i = 0; i < 26; i++) {
                int difficulty = i + 1;

                if (freq[i] >= difficulty) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}