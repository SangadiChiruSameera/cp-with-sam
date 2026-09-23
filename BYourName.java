import java.util.*;
public class BYourName{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String s1=sc.next();
            String s2=sc.next();
            char[] arr1=s1.toCharArray();
            char[] arr2=s2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i=0;
            while(i<n){
                if(arr1[i]==arr2[i]){
                    i++;
                }else{
                    System.out.println("NO");
                    break;
                }
            }
            if(i==n){
                System.out.println("YES");
            }
        }
    }
}