import java.util.*;
public class AHulk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            if(n%2==1){
                System.out.print("I hate it ");
            }else{
                System.out.print("I love it ");
            }
        }
    }
}