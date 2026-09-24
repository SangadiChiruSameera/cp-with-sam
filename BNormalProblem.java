import java.util.*;
public class BNormalProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            StringBuilder sb=new StringBuilder();
            for(char ch:str.toCharArray()){
                if(ch=='p') sb.append("q");
                else if(ch=='q') sb.append("p");
                else if(ch=='w') sb.append("w");
            }
            System.out.println(sb.reverse().toString());
        }
    }
}