import java.util.Scanner;

public class recursion3 {

    public static int factorial(int n) {
        if (n == 1 || n==0) {
            return 1;
        }
        int facto = factorial(n - 1);
        int fact = n * facto;
        return fact;
    }

    public static void main(String args[]) {
         Scanner df= new Scanner(System.in);
         System.out.println("ENter number for factorial");
         int n = df.nextInt();
         int ans=factorial(n);
         System.out.println(ans);
         df.close();
    }
}
