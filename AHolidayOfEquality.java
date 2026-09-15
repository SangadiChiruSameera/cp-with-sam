import java.util.*;
public class AHolidayOfEquality{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxNum=calcMax(arr);
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=(maxNum-arr[i]);
        }
        System.out.println(ans);
    }
    public static int calcMax(int[] arr){
        int maxNum=0;
        for(int num:arr){
            maxNum=Math.max(maxNum,num);
        }
        return maxNum;
    }
}