import java.util.*;
public class AFavoriteSequence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int i=0;
            int j=n-1;
            int[] ans=new int[n];
            int idx=0;
            while(i<j){
                ans[idx++]=arr[i];
                ans[idx++]=arr[j];
                i++;
                j--;
            }
            if(n%2!=0) ans[idx++]=arr[i];
            for(int num:ans){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}