import java.util.*;

public class ABeautifulYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        y++;

        while (true) {
            String s = String.valueOf(y);
            boolean beautiful = true;

            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        beautiful = false;
                        break;
                    }
                }
                if (!beautiful) {
                    break;
                }
            }

            if (beautiful) {
                System.out.println(y);
                break;
            }

            y++;
        }

        sc.close();
    }
}