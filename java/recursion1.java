import java.util.Scanner;

public class recursion1 {
    public static void printsum(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        printsum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the max number :");

        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        printsum(n);
        df.close();
    }
}
