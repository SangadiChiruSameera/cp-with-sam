import java.util.*;
public class ALoveStory{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        String str=sc.next();
        String check="codeforces";
        int ans=0;
        for(int i=0;i<10;i++){
            if(str.charAt(i)!=check.charAt(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
}