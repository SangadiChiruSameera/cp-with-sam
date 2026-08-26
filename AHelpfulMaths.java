import java.util.*;
public class AHelpfulMaths{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int[] arr=new int[3];
        for(int i=0;i<str.length();i+=2){
            if(str.charAt(i)!='+'){
                arr[(str.charAt(i)-'0')-1]++;
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<3){
            while(arr[i]!=0){
            sb.append(i+1);
            sb.append("+");
            arr[i]--;
            }
            i++;
        }
        sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());
    }
}