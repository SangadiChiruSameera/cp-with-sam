import java.util.*;
public class ADivisibilityProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int count=0;
            if(a%b!=0){
                count=b-a%b;
            }
            System.out.println(count);
        }
    }
}