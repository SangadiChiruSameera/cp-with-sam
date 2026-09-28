import java.util.*;
public class ACodeforcesChecking{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            String str="codeforces";
            char ch=sc.next().charAt(0);
            int idx=str.indexOf(ch);
            String ans=(idx==-1)?"NO":"YES";
            System.out.println(ans);
        }
    }
}