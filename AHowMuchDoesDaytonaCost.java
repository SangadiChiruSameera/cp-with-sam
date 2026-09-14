import java.util.*;
public class AHowMuchDoesDaytonaCost{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int n=sc.nextInt();
        int num=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(arr[i]==num){
                System.out.println("YES");
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("NO");
        }
    }
    }
}