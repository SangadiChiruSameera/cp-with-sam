import java.util.*;
public class ARemoveDuplicates{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println(list.size());
        Collections.reverse(list);
        for(int num:list){
            System.out.print(num+" ");
        }
    }
}