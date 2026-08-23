import java.util.*;
class AWayTooLongWords{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0){
            String word=sc.next();
            if(word.length()<=10){
                System.out.println(word);
                continue;
            }
            StringBuilder sb=new StringBuilder();
            sb.append(word.charAt(0));
            int count=0;
            for(int i=1;i<word.length()-1;i++){
                count++;
            }
            sb.append(count+"");
            sb.append(word.charAt(word.length()-1));
            System.out.println(sb.toString());
        }
    }
}