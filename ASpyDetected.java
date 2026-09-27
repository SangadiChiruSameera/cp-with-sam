import java.util.*;
public class ASpyDetected{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            }
            for(int i=0;i<n;i++){
                if(map.get(arr[i])==1){
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}