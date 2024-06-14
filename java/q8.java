import java.util.Scanner;

public class q8 {
    public static double calculatePower(double x, int n) {
        if (n == 0) {
            return 1;
        }

        double result = 1;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                result *= x;
            }
        } else {
            for (int i = -1; i >= n; i--) {
                result /= x;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the base value ");
        double x = df.nextDouble();
        System.out.println("Enter the power");
        int n = df.nextInt();
        df.close();
        double result = calculatePower(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}