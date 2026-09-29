import java.util.*;
public class AReconnaissance2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minABS=Integer.MAX_VALUE;
        int ai=-1;
        int aj=-1;
        for(int i=0;i<n;i++){
            int j=(i+1)%n;
                if(Math.abs(arr[i]-arr[j])<minABS){
                    minABS=Math.abs(arr[i]-arr[j]);
                    ai=i;
                    aj=j;
                }
        }
        System.out.println((ai+1)+" "+(aj+1));
    }
}