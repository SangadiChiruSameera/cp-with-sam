import java.util.*;
public class BIncreasing{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int i=1;
            while(i<n){
                if(arr[i-1]>=arr[i]){
                    System.out.println("NO");
                    break;
                }
                i++;
            }
            if(i==n){
                System.out.println("YES");
            }
        }
    }
}