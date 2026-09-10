import java.util.*;
public class APangram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<26){
            System.out.println("NO");
            return ;
        }
        String str=sc.next();
        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:str.toLowerCase().toCharArray()){
            //char x=Character.toLowerCase(ch);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.size()==26){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}