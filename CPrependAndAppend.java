import java.util.*;
public class CPrependAndAppend{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        String s=sc.next();
        int left=0;
        int right=n-1;
        int minLen=0;
            while(left<=right &&((s.charAt(left)=='0' && s.charAt(right)=='1') || (s.charAt(left)=='1' && s.charAt(right)=='0'))){
                left++;
                right--;
            }
            minLen=right-left+1;
            System.out.println(minLen);
    }
}
}