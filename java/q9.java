import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        int a = df.nextInt();
        int b = df.nextInt();

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else
                b = b - a;
        }
        df.close();
        System.out.println("GCD is :" + b);
    }

}
