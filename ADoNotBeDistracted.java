import java.util.*;
public class ADoNotBeDistracted{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            int idx=0;
            boolean found=false;
            HashMap<Character,Integer> map=new HashMap<>();
            while(idx<n){
                while(idx>0 && str.charAt(idx)==str.charAt(idx-1)){
                    idx++;
                }
                char ch=str.charAt(idx);
                if(map.containsKey(ch) && map.get(ch)>0){
                    System.out.println("NO");
                    found=true;
                    break;
                }
                map.put(ch,map.getOrDefault(ch,0)+1);
                idx++;
            }
            if(!found) System.out.println("YES");
        }
    }
}