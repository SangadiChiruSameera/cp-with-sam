import java.util.*;
public class AMarathon{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int count=0;
            int timur=sc.nextInt();
            for(int i=0;i<3;i++){
                int other=sc.nextInt();
                if(other>timur) count++;
            }
            System.out.println(count);
        }
    }
}