import java.util.*;
public class AGennadyAndACardGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String card1=sc.next();
        String[] cards=new String[5];
        for(int i=0;i<5;i++){
            cards[i]=sc.next();
        }
        char a1=card1.charAt(0);
        char a2=card1.charAt(1);
        boolean found=false;
        for(String str:cards){
            char c1=str.charAt(0);
            char c2=str.charAt(1);
            if(c1==a1 || c1==a2 || c2==a1 || c2==a2){
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}