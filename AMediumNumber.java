import java.util.*;
public class AMediumNumber{
    public static  void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int arr[]=new int[3];
            for(int i=0;i<3;i++){
                arr[i]=sc.nextInt();
            }
            int maxNum=calcMax(arr);
            int minNum=calcMin(arr);
            //System.out.println(maxNum+" "+minNum);
            if(arr[0]!=maxNum && arr[0]!=minNum){
                System.out.println(arr[0]);
            }else if(arr[1]!=maxNum && arr[1]!=minNum){
                System.out.println(arr[1]);
            }else if(arr[2]!=maxNum && arr[2]!=minNum){
                System.out.println(arr[2]);
            }
        }
    }
    public static int calcMax(int[] arr){
        int maxNum=0;
        for(int num:arr){
            maxNum=Math.max(maxNum,num);
        }
        return maxNum;
    } 
    public static int calcMin(int[] arr){
        int minNum=Integer.MAX_VALUE;
        for(int num:arr){
            minNum=Math.min(minNum,num);
        }
        return minNum;
    } 
}