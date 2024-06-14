import java.util.*;

public class functions {

    public static void printnum(String name) {
        System.out.println(name);
        return;
    }

    public static int sumnum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
        return sum;

    }

    public static void factorial(int n) {
        int num = 1;
        if (n <= 0) {
            System.out.println("INvalid number");
            return;
        }
        for (int i = n; i >= 1; i--) {
            num = num * i;
        }
        System.out.println(num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        sumnum(a, b);
        factorial(b);

        printnum(name);

    }
}
