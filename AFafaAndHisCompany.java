import java.util.*;
public class AFafaAndHisCompany{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        for(int l=1;l<n;l++){
            if(n%l==0){
                ans++;
            }
        }
        System.out.println(ans);
    }
}