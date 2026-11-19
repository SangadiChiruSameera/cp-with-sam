import java.util.*;
public class BCopycopycopycopycopy{
    public static void main(String args[]){
        Scanner  sc=new Scanner(System.in);
        int  t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int[] lis=new int[n];
            Arrays.fill(lis,1);
            int ans=0;
            for(int i=1;i<n;i++){
                for(int j=0;j<i;j++){
                    if(arr[j]<arr[i]){
                        //System.out.println(arr[i]);
                        lis[i]=Math.max(lis[i],1+lis[j]);
                    }
                }
                ans=Math.max(ans,lis[i]);
            }
            System.out.println(ans);
        }
    }
}