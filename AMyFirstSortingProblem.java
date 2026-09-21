import java.util.*;
public class AMyFirstSortingProblem{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            if(num1>num2){
                System.out.println(num2+" "+num1);
            }else{
                System.out.println(num1+" "+num2);
            }
        }
    }
}