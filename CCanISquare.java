import java.util.*;
public class CCanISquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            long total=0;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                total+=num;
            }
            if(isSqrt(total)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    public static boolean isSqrt(long num){
        if(num<0){
            return false;
        }
        long sqrt=(long)Math.sqrt(num);
        return (sqrt*sqrt==num);
    }
}