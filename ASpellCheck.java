import java.util.*;
public class ASpellCheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            if(n!=5){
                System.out.println("NO");
                continue;
            }
            if(!str.contains("T")){
                System.out.println("NO");
                continue;
            }else if(!str.contains("i")){
                System.out.println("NO");
                continue;
            }else if(!str.contains("m")){
                System.out.println("NO");
                continue;
            }else if(!str.contains("u")){
                System.out.println("NO");
                continue;
            }if(!str.contains("r")){
                System.out.println("NO");
                continue;
            }else{
                System.out.println("YES");
            }
        }
    }
}