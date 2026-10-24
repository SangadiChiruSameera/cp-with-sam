import java.util.*;
public class ATheNewYearMeetingFriends{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int ans1=Math.abs(x1-x2)+Math.abs(x1-x3);
        int ans2=Math.abs(x1-x2)+Math.abs(x2-x3);
        int ans3=Math.abs(x3-x2)+Math.abs(x1-x3);
        System.out.println(Math.min(ans1,Math.min(ans2,ans3)));
    }
}