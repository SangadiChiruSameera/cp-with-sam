import java.util.*;
public class AMishkaAndGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int rounds=sc.nextInt();
        int mScore=0;
        int cScore=0;
        while(rounds-->0){
            int m=sc.nextInt();
            int c=sc.nextInt();
            if(m>c) mScore++;
            else if(c>m) cScore++;
        }
        if(mScore>cScore){
            System.out.println("Mishka");
        }else if(cScore>mScore){
            System.out.println("Chris");
        }else{
            System.out.println("Friendship is magic!^^");
        }
    }
}