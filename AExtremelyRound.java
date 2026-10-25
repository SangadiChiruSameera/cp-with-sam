import java.util.*;
public class AExtremelyRound{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            if(n<10){
                ans+=n;
                System.out.println(ans);
            }else if(n>=100){
                System.out.println(19+(n/100)-1);
            }else{
                System.out.println(9+(n/10));
            }
        }
    }
}