import java.util.*;
public class AFoxAndSnake{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            if(i%2!=0){
                if(flag){
                    System.out.print("#");
                }
                for(int j=1;j<m;j++){
                    System.out.print(".");
                }
                if(!flag){
                    System.out.print("#");
                }
                flag=!flag;
            }else{
               for(int j=0;j<m;j++){
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}