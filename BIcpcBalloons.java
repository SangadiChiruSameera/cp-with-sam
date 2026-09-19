import java.util.*;
public class BIcpcBalloons {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int ans=0;
            HashMap<Character,Integer> map=new HashMap<>();
            for(char ch:str.toCharArray()){
                ans+=1;
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(map.get(ch)==1){
                    ans+=1;
                }
            }
            System.out.println(ans);
        }
    }
}
