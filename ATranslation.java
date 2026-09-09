import java.util.*;
public class ATranslation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        StringBuilder sb=new StringBuilder(t);
        String revT=sb.reverse().toString();
        if(s.equals(revT)){
            System.out.println("YES");
        }else{
            System.out.println(" NO");
        }
    }
}