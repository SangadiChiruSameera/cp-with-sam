import java.util.*;
public class AOnlyOneDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int minDigit=(int)1e9;
            while(n>0){
                minDigit=Math.min(minDigit,n%10);
                n/=10;
            }
            System.out.println(minDigit);
        }
    }
}