import java.util.*;
public class ABeautifulMatrix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[5][5];
        int r=-1;
        int c=-1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arr[i][j]=sc.nextInt();
                if(arr[i][j]==1){
                    r=i;
                    c=j;
                }
            }
        }
        int ans=Math.abs(2-r)+Math.abs(2-c);
        System.out.println(ans);
    }
}