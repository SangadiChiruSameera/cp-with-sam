import java.util.*;
public class AShortSubstrings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            StringBuilder sb=new StringBuilder();
            sb.append(""+str.charAt(0));
            int i=1;
            while(i<str.length()){
                sb.append(""+str.charAt(i));
                i+=2;
            }
            System.out.println(sb.toString());
        }
    }
}
