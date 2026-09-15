import java.util.*;
public class AOddOneOut{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int xor=a^b^c;
            System.out.println(xor);
        }
    }
}