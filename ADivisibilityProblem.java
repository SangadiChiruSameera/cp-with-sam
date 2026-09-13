import java.util.*;
public class ADivisibilityProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
            while(a%b!=0){
                a++;
                count++;
            }
            System.out.println(count);
        }
    }
}