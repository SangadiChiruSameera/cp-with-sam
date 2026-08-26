import java.util.*;
public class ATheatreSquare{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a=sc.nextInt();
    long x=(n+a-1)/a;//for ceil value
    long y=(m+a-1)/a;//for ceil value
    System.out.println(x*y);
}
}