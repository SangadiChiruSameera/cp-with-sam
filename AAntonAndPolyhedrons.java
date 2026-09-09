import java.util.*;
public class AAntonAndPolyhedrons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n-->0){
            String str=sc.next();
            if(str.equals("Tetrahedron")) ans+=4;
            else if(str.equals("Cube")) ans+=6;
            else if(str.equals("Octahedron")) ans+=8;
            else if(str.equals("Dodecahedron")) ans+=12;
            else ans+=20;
        }
        System.out.println(ans);
    }
}