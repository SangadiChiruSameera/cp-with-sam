import java.util.*;
public class AVusTheCossackAndAContest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int p=sc.nextInt();
        if(n>=k && p>=k){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}