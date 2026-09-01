import java.util.*;

public class AWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int upper = 0;

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            }
        }

        if (upper > s.length() - upper) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}