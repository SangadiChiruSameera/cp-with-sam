import java.util.*;
public class ARepeatingCipher{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i=2*i+1){
            sb.append(str.charAt(i)+"");
        }
        System.out.println(sb.toString());
    }
}