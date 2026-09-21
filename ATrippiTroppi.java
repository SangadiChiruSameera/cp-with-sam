import java.util.*;
public class ATrippiTroppi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String str=sc.nextLine();
            StringBuilder sb=new StringBuilder();
            for(String s:str.split(" ")){
                sb.append(s.charAt(0)+"");
            }
            System.out.println(sb.toString());
        }
    }
}