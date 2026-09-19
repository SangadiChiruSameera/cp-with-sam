import java.util.*;
public class ABlackSquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        int a4=sc.nextInt();
        String str=sc.next();
        int ans=0;
        for(char ch:str.toCharArray()){
            if(ch=='1') ans+=a1;
            else if(ch=='2') ans+=a2;
            else if(ch=='3') ans+=a3;
            else ans+=a4;
        }
        System.out.println(ans);
    }
}