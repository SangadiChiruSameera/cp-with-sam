import java.util.*;
public class AABAgain{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            int sum=num%10+(num/10)%10;
            System.out.println(sum);
        }
    }
}