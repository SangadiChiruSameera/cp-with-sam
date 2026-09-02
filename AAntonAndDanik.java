import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class AAntonAndDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        // Read n
        int n = Integer.parseInt(reader.readLine().trim());
        
        // Read outcome string
        String s = reader.readLine().trim();
        
        int antonWins = 0;
        int danikWins = 0;
        
        // Count total wins for each player
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'A') {
                antonWins++;
            } else {
                danikWins++;
            }
        }
        
        // Determine the overall winner
        if (antonWins > danikWins) {
            System.out.println("Anton");
        } else if (danikWins > antonWins) {
            System.out.println("Danik");
        } else {
            System.out.println("Friendship");
        }
    }
}