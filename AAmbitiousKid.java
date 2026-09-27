import java.util.*;
public class AAmbitiousKid{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int minDist=Integer.MAX_VALUE;
            for(int num:arr){
                minDist=Math.min(minDist,Math.abs(num));
            }
            System.out.println(minDist);
    }
}