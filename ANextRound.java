import java.util.*;
public class ANextRound {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<=k;i++){
            if(arr[i]>k){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
