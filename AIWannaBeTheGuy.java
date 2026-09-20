import java.util.*;
public class AIWannaBeTheGuy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        int n=sc.nextInt();
        int size1=sc.nextInt();
        for(int i=0;i<size1;i++){
            int num=sc.nextInt();
            set.add(num);
        }
        int size2=sc.nextInt();
        for(int i=0;i<size2;i++){
            int num=sc.nextInt();
            set.add(num);
        }
        if(set.size()==n){
            System.out.println("I become the guy.");
        }else{
            System.out.println( "Oh, my keyboard!");
        }
    }
}