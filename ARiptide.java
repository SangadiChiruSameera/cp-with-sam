import java.util.*;
public class ARiptide{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int diffA=Math.min(Math.abs(a-b),Math.abs(a-c));
        int diffB=Math.min(Math.abs(a-b),Math.abs(b-c));
        int diffC=Math.min(Math.abs(c-b),Math.abs(a-c));
        int ans=Math.min(diffA,Math.min(diffB,diffC));
        System.out.println(ans);
        }
    }
}