import java.util.*;
public class AMaximumInTable{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // {1, 1, 1, 1, 1}, 
        // {1, 2, 3, 4, 5}, 
        // {1, 3, 6, 10, 15}, 
        // {1, 4, 10, 20, 35}, 
        // {1, 5, 15, 35, 70}.
        int[][] arr=new int[n][n];
        arr[0][0]=1;
        //System.out.println(arr[0][0]);
        for(int i=1;i<n;i++){
            arr[i][0]=1;
            arr[0][i]=1;
            //System.out.println(arr[i][1]+" "+arr[1][i]);
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i-1][j]+arr[i][j-1];
                //System.out.print(arr[i][j]+" ");
            }
            //System.out.println();
        }
        System.out.println(arr[n-1][n-1]);
    }
}