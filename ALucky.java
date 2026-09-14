import java.util.*;
public class ALucky{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String num=sc.next();
            int sSum=0;
            int lSum=0;
            int left=0;
            int right=num.length()-1;
            while(left<=right){
                sSum+=num.charAt(left)-'0';
                lSum+=num.charAt(right)-'0';
                left++;
                right--;
            }
            if(sSum==lSum){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}