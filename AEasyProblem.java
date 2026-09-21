import java.util.*;
public class AEasyProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans=0;
            for(int i=1;i<=n/2;i++){
                int j=n-i;
                if(j==i) ans+=1;
                else ans+=2;
            }
            System.out.println(ans);
        }
    }
}