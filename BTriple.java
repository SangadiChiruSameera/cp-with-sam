import java.util.*;
public class BTriple{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int num:arr){
                map.put(num,map.getOrDefault(num,0)+1);
            }
            int ans=-1;
            for(int num:arr){
                if(map.get(num)>=3) ans=num;
            }
            System.out.println(ans);
        }
    }
}