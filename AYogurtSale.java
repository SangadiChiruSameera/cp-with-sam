import java.util.*;
public class AYogurtSale{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int single=sc.nextInt();
            int both=sc.nextInt();
            int ans=0;
            if(n%2==0){
                ans=Math.min(n*single,(n/2)*both);
            }else{
                ans=Math.min((n-1)*single,((n-1)/2)*both)+single;
            }
            System.out.println(ans);
        }
    }
}