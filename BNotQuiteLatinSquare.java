import java.util.*;
public class BNotQuiteLatinSquare{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            char[][] mat=new char[3][3];
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    mat[i][j]=sc.next().charAt(0);
                }
            }
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(mat[i][j]+" ");
                }
                System.out.println();
            }
            int aCount,bCount,cCount;
            for(int i=0;i<3;i++){
                aCount=0;bCount=0;cCount=0;
                boolean ans=false;
                for(int j=0;j<3;j++){
                    if(mat[i][j]=='A'){
                        aCount++;
                    }else if(mat[i][j]=='B'){
                        bCount++;
                    }else if(mat[i][j]=='C'){
                        cCount++;
                    }else{
                        ans=true;
                    }
                }
                if(ans==true){
                    if(aCount==0){
                        System.out.println("A");
                    }else if(bCount==0){
                        System.out.println("B");
                    }else{
                        System.out.println("C");
                    }
                    break;
                }
            }
        }
    }
}