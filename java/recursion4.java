import java.util.*;

public class recursion4 {

    public static void fibo(int a, int b, int n){
        if(n==0){
            return ;
        }
        int c =a+b;
        System.out.println(c);
        fibo(b,c,n-1);
    }
    public static void main(String[] args){
           Scanner df = new Scanner(System.in);
           System.out.println("Enter the Nth number: ");
           int n = df.nextInt();
           int a = 0;
           int b =1;
           System.out.println(a);
           System.out.println(b);
           fibo(a,b,n-2);
           df.close();
    }
}
