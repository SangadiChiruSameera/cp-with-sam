import java.util.*;
public class BBlankSpace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            } 
            int left=0;
            int right=0;
            int maxLen=0;
            while(right<n){
                if(arr[right]==1){
                    left=right+1;
                }else{
                    maxLen=Math.max(maxLen,right-left+1);
                }
                right++;
            }
            System.out.println(maxLen);
        }
    }
}