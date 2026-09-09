import java.util.*;
public class AVanyaAndFence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int h=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=0;
        for(int eh:arr){
            if(eh%h==0){
                //System.out.println(ans);
                ans+=(eh/h);
            }else{
                //System.out.println(ans);
                ans+=Math.floor((eh/h))+1;
            }
        }
        System.out.println(ans);
    }
}