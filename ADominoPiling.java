import java.util.*;
public class ADominoPiling{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int ans=0;
        if(m%2==0){
            ans+=(m/2)*n;
        }else{
            ans+=(m/2)*n+(n/2);
        }
        System.out.println(ans);
    }
}