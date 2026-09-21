import java.util.*;
public class ABrainSPhotos{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        char[][] grid=new char[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                grid[i][j]=sc.next().charAt(0);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='B' || grid[i][j]=='W' || grid[i][j]=='G'){
                    count++;
                }
            }
        }
        if(count==m*n){
            System.out.println( "#Black&White");
        }else{
            System.out.println("#Color");
        }
    }
}