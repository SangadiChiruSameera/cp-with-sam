import java.util.*;
public class AMinimize{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int minAns=Integer.MAX_VALUE;
            for(int c=a;c<=b;c++){
                minAns=Math.min(minAns,(c-a)+(b-c));
            }
            System.out.println(minAns);
        }
    }
}