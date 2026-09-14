import java.util.*;
public class AAmusingJoke{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        String str3=sc.next();
        int[] arr=new int[26];
        for(char ch:str1.toCharArray()){
            arr[ch-'A']++;
        }
        for(char ch:str2.toCharArray()){
            arr[ch-'A']++;
        }
        for(char ch:str3.toCharArray()){
            arr[ch-'A']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}