import java.util.*;
public class AAntonAndLetters{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int i=1;
        while(i<str.length()-1){
                //System.out.println(str.charAt(i));
                set.add(str.charAt(i));
                i+=3;
            }
        System.out.println(set.size());
    }
}