import java.util.*;
public class ASumOfRoundNumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int num=sc.nextInt();
            int maxDeg=calcDeg(num);
            //System.out.println(maxDeg);
            if(maxDeg==0){
                System.out.println("1");
                System.out.println(num);
                continue;
            }
            while(num>0){
                int rem=num%maxDeg;
                num/=maxDeg;
                maxDeg/=10;
                System.out.println(rem+" ");
            }
            System.out.println();
        }
    }
    public static int calcDeg(int num){
        int deg=1;
        while(num>0){
            deg*=10;
            num/=10;
        }
        return deg/10;
    }
}