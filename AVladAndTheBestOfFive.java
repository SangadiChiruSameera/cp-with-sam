import java.util.*;
public class AVladAndTheBestOfFive{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            int countA=0;
            int countB=0;
            for(char ch:str.toCharArray()){
                if(ch=='A') countA++;
                else countB++;
            }
            if(countA>countB){
                System.out.println("A");
            }else{
                System.out.println("B");
            }
        }
    }
}