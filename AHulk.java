import java.util.*;
public class AHulk{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        sb.append("I");
        sb.append(" hate");
        boolean flag=false;
        while(--n>0){
            sb.append(" that");
            if(flag){
                sb.append(" I");
                sb.append(" hate");
            }else{
                sb.append(" I");
                sb.append(" love");
            }
            flag=!flag;
        }
        sb.append(" it");
        System.out.println(sb.toString());
    }
}