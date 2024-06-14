import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the Nth term ");
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("The sum of first N terms are " + sum);
        df.close();
    }
}
