import java.util.*;
public class ASoftDrinking{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // n, k, l, c, d, p, nl, np,
        int n=sc.nextInt();//frnds
        int k=sc.nextInt();//bottles
        int l=sc.nextInt();////litrs
        int c=sc.nextInt();//lime
        int d=sc.nextInt();//slice
        int p=sc.nextInt();//salt
        int nl=sc.nextInt();//required ml 
        int np=sc.nextInt();//requires salt
        int first=(k*l)/nl;
        int second=(c*d);
        int third=(p)/np;
        int ans=Math.min(first,Math.min(second,third))/n;
        System.out.println(ans);
    }
}