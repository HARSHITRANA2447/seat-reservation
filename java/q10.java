import java.util.*;

public class q10 {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the Nth number ");
        int n = df.nextInt();
        int a = 0, b = 1;
        System.out.println(a + " ");

        if (n > 1) {
            for (int i = 2; i <= n; i++) {
                System.out.println(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
            df.close();
        }

    }
}
