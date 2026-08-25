import java.util.*;
public class ABit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        while(n-->0){
            String str=sc.next();
            //System.out.println(str+" "+str.contains("++"));
            if(str.contains("++")){
                k++;
            }else{
                k--;
            }
        }
        System.out.println(k);
    }
}