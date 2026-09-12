import java.util.*;
public class AUltraFastMathematician{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    StringBuilder sb=new StringBuilder();
        for(int i=0;i<s1.length();i++){
            int ch1=s1.charAt(i)-'0';
            int ch2=s2.charAt(i)-'0';
            if(ch1!=ch2){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        System.out.println(sb.toString());
    }
}