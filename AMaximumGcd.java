import java.util.*;
public class AMaximumGcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==1){
                System.out.println(1);
                break;
            }
            int maxgcd=1;
            for(int i=2;i<=n;i++){
                for(int j=2;j<=i;j++){
                    if(i==j) continue;
                    maxgcd=Math.max(maxgcd,gcd(i,j));
                }
            }
            System.out.println(maxgcd);
        }
    }
    public static int gcd(int a,int b){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
}