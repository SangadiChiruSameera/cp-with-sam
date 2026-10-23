import java.util.*;
public class APrimaryTask{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=n+" ";
            //System.out.println(str);
            if(!str.substring(0,2).equals("10")){
                System.out.println("NO");
                break;
            }
            int num=Integer.parseInt(str.substring(2,4));
            System.out.println(num);
            // if(num<2){
            //     System.out.println("NO");
            // }else{
            //     System.out.println("YES");
            // }
        }
    }
}