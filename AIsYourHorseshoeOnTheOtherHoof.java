import java.util.*;
public class AIsYourHorseshoeOnTheOtherHoof{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<4;i++){
            int input=sc.nextInt();
            set.add(input);
        }
        System.out.println(4-set.size());
    }
}