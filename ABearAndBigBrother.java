import java.util.*;
public class ABearAndBigBrother {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int year=0;
        do{
            a*=3;
            b*=2;
            year++;
        }while(a<=b);
        System.out.println(year);
    }
}
