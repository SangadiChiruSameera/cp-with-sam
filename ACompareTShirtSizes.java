import java.util.*;

public class ACompareTShirtSizes{

    static int value(String s) {
        if (s.equals("M")) {
            return 0;
        }

        int xCount = s.length() - 1;

        if (s.charAt(s.length() - 1) == 'S') {
            return -(xCount + 1);
        }

        return xCount + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            int va = value(a);
            int vb = value(b);

            if (va < vb)
                System.out.println("<");
            else if (va > vb)
                System.out.println(">");
            else
                System.out.println("=");
        }

        sc.close();
    }
}