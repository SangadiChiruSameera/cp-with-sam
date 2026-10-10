import java.util.Scanner;

public class ATram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int passengers = 0;
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt(); // Passengers exiting
            int b = sc.nextInt(); // Passengers entering

            passengers = passengers - a + b;

            capacity = Math.max(capacity, passengers);
        }

        System.out.println(capacity);
        sc.close();
    }
}