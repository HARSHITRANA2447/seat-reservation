import java.util.Scanner;

public class q3 {
    public static void greater(int a, int b) {
        if (a > b) {
            System.out.println("A is greater than b ");
        } else
            System.out.println("B is greater than a ");
    }

    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        int a = df.nextInt();
        int b = df.nextInt();
        df.close();
        greater(a, b);
    }
}
