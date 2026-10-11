
import java.util.Scanner;

public class ASystemOfEquations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int count = 0;

        for (int a = 0; a <= 1000; a++) {
            for (int b = 0; b <= 1000; b++) {
                if (a * a + b == n && a + b * b == m) {
                    count++;
                }
            }
        }

        System.out.println(count);
        sc.close();
    }
}