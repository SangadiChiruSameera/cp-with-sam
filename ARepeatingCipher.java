import java.util.*;

public class ARepeatingCipher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str = sc.next();

        StringBuilder sb = new StringBuilder();

        int i = 0;
        int count = 1;

        while (i < n) {
            sb.append(str.charAt(i));
            i += count;
            count++;
        }

        System.out.println(sb);
    }
}