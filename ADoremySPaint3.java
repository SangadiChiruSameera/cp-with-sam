// import java.util.*;
// public class ADoremySPaint3{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         while(t-->0){
//             int n=sc.nextInt();
//             int[] nums=new int[n];
//             for(int i=0;i<n;i++){
//                 nums[i]=sc.nextInt();
//             }
//             HashMap<Integer,Integer> map=new HashMap<>();
//             for(int i=0;i<n;i++){
//                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//             }
//             if(map.size()>2){
//                 System.out.println("No");
//                 continue;
//             }
//             if(map.size()==1){
//                 System.out.println("Yes");
//                 continue;
//             }
//             int[] freq=new int[2];
//             int idx=0;
//             for(int key:map.keySet()){
//                 freq[idx++]=map.get(key);
//             }
//             if(Math.abs(freq[0]-freq[1])<=1){
//                 System.out.println("Yes");
//             }else{
//                 System.out.println("No");
//             }
//         }
//     }
// }
import java.util.*;
public class ADoremySPaint3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            if(map.size()>2){
                System.out.println("No");
                continue;
            }
            if(map.size()==1){
                System.out.println("Yes");
                continue;
            }
            Iterator<Integer> it=map.values().iterator();
            int freq1=it.next();
            int freq2=it.next();
            // if(Math.abs(freq1-freq2)<=1){
            //     System.out.println("Yes");
            // }else{
            //     System.out.println("No");
            // }
            System.out.println((Math.abs(freq1-freq2)<=1)?"Yes":"No");
        }
    }
}