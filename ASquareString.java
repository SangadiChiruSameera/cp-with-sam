import java.util.*;
public class ASquareString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            int n=str.length();
            if(n%2!=0){
                System.out.println("NO");
                continue;
            }
            int fStart=0;
            int sStart=n/2;
            while(sStart<n){
                if(str.charAt(fStart)!=str.charAt(sStart)){
                    System.out.println("NO");
                    break;
                }
                fStart++;
                sStart++;
            }
            if(sStart==n){
                System.out.println("YES");
            }
        }
    }
}