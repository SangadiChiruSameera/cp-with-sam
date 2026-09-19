import java.util.*;
public class ACreatingWords{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str1=sc.next();
            String str2=sc.next();
            String ans1=str2.charAt(0)+str1.substring(1);
            String ans2=str1.charAt(0)+str2.substring(1);
            System.out.println(ans1+" "+ans2);
        }
    }
}