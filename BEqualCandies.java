import java.util.*;
public class BEqualCandies{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int minNum=findMin(arr);
            int ans=0;
            for(int i=0;i<n;i++){
                ans+=(arr[i]-minNum);
            }
            System.out.println(ans);
        }
    }
    public static int findMin(int[] arr){
        int minNum=Integer.MAX_VALUE;
        for(int num:arr){
            minNum=Math.min(minNum,num);
        }
        return minNum;
    }
}