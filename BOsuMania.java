import java.util.*;
public class BOsuMania{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            char[][] chArray=new char[n][4];
            for(int i=0;i<n;i++){
                String str=sc.nextLine();
                chArray[i]=str.toCharArray();
            }
            int ans[]=new int[n];
            int idx=0;
            for(int i=n-1;i>=0;i--){
                for(int j=0;j<4;j++){
                    if(chArray[i][j]=='#'){
                        ans[idx++]=j+1;
                        break;
                    }
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}