import java.util.*;
public class APlusOrMinus {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int k=sc.nextInt();
        if(a+b==k){
            System.out.println("+");
        }else{
            System.out.println("-");
        }
    }
}
}