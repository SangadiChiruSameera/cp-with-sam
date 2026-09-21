import java.util.*;
public class AAB{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            int num1=str.charAt(0)-'0';
            int num2=str.charAt(2)-'0';
            System.out.println(num1+num2);
        }
    }
}