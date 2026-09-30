import java.util.*;
public class AMaximumIncrease{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] lis=new int[n];
        Arrays.fill(lis,1);
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                lis[i]=Math.max(lis[i],1+lis[i-1]);
            }
        }
        int maxAns=0;
        for(int num:lis){
            maxAns=Math.max(maxAns,num);
        }
        System.out.println(maxAns);
    }
}