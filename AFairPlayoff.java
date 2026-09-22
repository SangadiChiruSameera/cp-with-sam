import java.util.*;
public class AFairPlayoff{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int arr[]=new int[4];
            for(int i=0;i<4;i++){
                arr[i]=sc.nextInt();
            }
            int firstMax=arr[0];
            int secondMax=arr[0];
            for(int num:arr){
                if(num>firstMax){
                    secondMax=firstMax;
                    firstMax=num;
                }else if(num<firstMax && num>secondMax){
                    secondMax=num;
                }
            }
            int firstWin=Math.max(arr[0],arr[1]);
            int secondWin=Math.max(arr[2],arr[3]);
            if((firstWin==firstMax && secondWin==secondMax) || 
                (firstWin==secondMax && secondWin==firstMax)){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
        }
    }
}