import java.util.*;
public class ADislikeOfThrees{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int num=1;
            while(n-->0){
                while(num%10==3 || num%3==0){
                    num++;
                }
                num++;
            }
            System.out.println(num-1);
        }
    }
}