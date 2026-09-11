import java.util.*;
public class APresents{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt()-1;
        }
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]]=i+1;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
    }
}