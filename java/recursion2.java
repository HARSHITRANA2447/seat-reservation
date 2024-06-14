import java.util.Scanner;

public class recursion2 {

    public static void sum(int a, int n, int sum) {
        if (a == n) {
            sum += a;
            System.out.println(sum);
            return;
        }
        sum += a;
        sum(a + 1, n, sum);
    }

    public static void main(String args[]) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the Nth value");
        int n = df.nextInt();
        sum(1, n, 0);
        df.close();
    }
}
