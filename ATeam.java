import java.util.*;
public class ATeam{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n-->0){
            int count=0;
            for(int i=0;i<3;i++){
                int input=sc.nextInt();
                if(input==1) count++;
            }
            if(count>=2) ans++;
        }
        System.out.println(ans);
    }
}