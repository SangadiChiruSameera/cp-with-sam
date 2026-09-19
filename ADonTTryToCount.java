import java.util.*;
public class ADonTTryToCount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            int ans=-1;
            for(int op=0;op<=5;op++){
                if(str1.contains(str2)){
                    ans=op;
                    break;
                }
                str1+=str1;
            }
            System.out.println(ans);
        }
    }
}