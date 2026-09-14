import java.util.*;
public class ASerejaAndDima{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=n-1;
        int dScore=0;
        int sScore=0;
        boolean flag=true;
        while(left<=right){
            int maxCard=0;
            if(arr[left]<arr[right]){
                maxCard=arr[right];
                right--;
            }else{
                maxCard=arr[left];
                left++;
            }
            if(flag){
                sScore+=maxCard;
            }else{
                dScore+=maxCard;
            }
            flag=!flag;
        }
        System.out.println(sScore+" "+dScore);
    }
}