import java.util.*;
public class AShortSort{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            int correct=0;
            if(str.charAt(0)=='a') correct++;
            else if(str.charAt(1)=='b') correct++;
            else if(str.charAt(2)=='c') correct++;
            if(correct<1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}