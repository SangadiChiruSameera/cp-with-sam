import java.util.*;
public class CWordOnThePaper{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();  
        while(t-->0){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<8;i++){
                String str=sc.nextLine();
                for(char ch:str.toCharArray()){
                    if(ch!='.'){
                        sb.append(ch);
                    }
                }
            }
            System.out.println(sb.toString());
        }
    }
}