import java.util.*;
public class ABit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=n;
        n=0;
        while(k-->0){
            String op=sc.next();
            if(op.equals("++X")){
                --n;
            }else if(op.equals("X++")){
                n++;
            }else if(op.equals("--X")){
                --n;
            }else{
                n--;
            }
        }
        System.out.println(n);
    }
}