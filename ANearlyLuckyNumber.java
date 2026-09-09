import java.util.*;
public class ANearlyLuckyNumber{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String num=sc.next();
        int count=0;
        int i=0;
        while(i<num.length()){
            int lastDigit=num.charAt(i)-'0';
            if(lastDigit==4 || lastDigit==7){
                count++;
            }
            i++;
        }
        if(count==4 || count==7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}