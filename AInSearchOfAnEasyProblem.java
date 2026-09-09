import java.util.*;
public class AInSearchOfAnEasyProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n-->0){
            int input=sc.nextInt();
            if(input==1){
                System.out.println("HARD");
                return ;
            }
        }
        System.out.println("EASY");
    }
}