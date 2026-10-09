import java.util.*;
public class ALinearKeyboard{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String keyBoard=sc.next();
            String str=sc.next();
            int i=keyBoard.indexOf((str.charAt(0)));
            int ans=0;
            for(int k=1;k<str.length();k++){
                int j=keyBoard.indexOf((str.charAt(k)));
                //System.out.println(i+" "+j);
                ans+=Math.abs(i-j);
                i=j;
            }
            System.out.println(ans);
        }
    }
}