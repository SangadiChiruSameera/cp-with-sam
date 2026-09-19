import java.util.*;
public class ADonTTryToCount{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            if(str1.contains(str2)){
                System.out.println("0");
                continue ;
            }
            int count=0;
            StringBuilder sb=new StringBuilder(str1);
            while(!sb.toString().contains(str2)){
                sb.append(sb);
                count++;
                if(sb.toString().contains(str2)){
                    System.out.println(count);
                    break;
                }
                if(count>str2.length()) break;
                //System.out.println("--"+count);
            }
            if(!sb.toString().contains(str2)){
                System.out.println("-1");
                continue ;
            }
        }
    }
}