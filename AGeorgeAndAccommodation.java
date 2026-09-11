import java.util.*;
public class AGeorgeAndAccommodation{
    public static void main(String[] args){
        int ans=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(q-p>=2) ans++;
        }
        System.out.println(ans);
    }
}