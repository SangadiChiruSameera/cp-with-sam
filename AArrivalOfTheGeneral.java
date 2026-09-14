import java.util.*;
public class AArrivalOfTheGeneral{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int minIdx=0;
        int maxIdx=0;
        for(int i=1;i<n;i++){
            if(arr[i]<=arr[minIdx]){
                minIdx=i;
            }else if(arr[i]>=arr[maxIdx]){
                maxIdx=i;
            }
        }
        //System.out.println(minIdx+" "+maxIdx);
        System.out.println((n-minIdx-1)+(maxIdx-1));
    }
}