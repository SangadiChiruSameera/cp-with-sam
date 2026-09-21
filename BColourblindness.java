import java.util.*;
public class BColourblindness{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            int i=0;
            while(i<n){
                if(((str1.charAt(i)=='R')&&(str2.charAt(i)!='R'))||((str1.charAt(i)!='R')&&(str2.charAt(i)=='R'))){
                    System.out.println("NO");
                    break;
                }
                i++;
            }
            if(i==n){
                    System.out.println("YES");
            }
        }
    }
}