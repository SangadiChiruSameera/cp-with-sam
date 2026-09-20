import java.util.*;
public class AButtons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=a+b+c;
            boolean anna=true;
            while(n-->0){
                if(anna && a>0){
                    a--;
                }else if(!anna && b>0){
                    b--;
                }else{
                    c--;
                }
                anna=!anna; 
            }
            if(!anna){
                System.out.println("First");
            }else{
                System.out.println("Second");
            }
        }
    }
}