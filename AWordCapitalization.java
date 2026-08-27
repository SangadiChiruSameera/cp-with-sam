import java.util.*;
public class AWordCapitalization{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char ch=str.charAt(0);
        System.out.println(Character.toUpperCase(ch)+str.substring(1));
    }
}