import java.util.*;
public class APoliceRecruits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        int count=0;
        for(int i=0;i<n;i++){
            ans+=sc.nextInt();
            if(ans==-1){
                count++;
                ans=0;
            }
        }
        System.out.println(count);
    }
}