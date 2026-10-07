import java.util.*;
public class BTenWordsOfWisdom{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[][] arr=new int[n][2];
            for(int i=0;i<n;i++){
                arr[i][0]=sc.nextInt();
                arr[i][1]=sc.nextInt();
            }
            int q=Integer.MIN_VALUE;
            int r=0;
            for(int i=0;i<n;i++){
                int resp=arr[i][0];
                int quality=arr[i][1];
                if(resp<=10){
                    if(quality>q){
                        q=quality;
                        r=i+1;
                    }
                }
            }
            System.out.println(r);
        }
    }
}