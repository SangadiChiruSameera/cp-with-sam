import java.util.*;
public class ACalculatingFunction{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int i=1;i<=n;i++){
            if(i%2==1){
                ans+=(i*(-1));
            }else{
                ans+=i;
            }
        }
        System.out.println(ans);
    }
}