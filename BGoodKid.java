import java.util.*;
public class BGoodKid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int minIdx=findMinIdx(arr);
            arr[minIdx]+=1;
            int ans=1;
            for(int i=0;i<n;i++){
                ans*=arr[i];
            }
            System.out.println(ans);
        }
    }
    public static int findMinIdx(int[] arr){
        int minIdx=0;
        for(int i=1;i<arr.length;i++){
            if(arr[minIdx]>arr[i]){
                minIdx=i;
            }
        }
        return minIdx;
    }
}