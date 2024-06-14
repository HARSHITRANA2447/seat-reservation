import java.util.Scanner;

public class q1 {

    public static void average(int a, int b, int c) {
        int av = 0;
        av = (a + b + c) / 3;
        System.out.println("the average of numbers are " + av);
        return;
    }

    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        int a = df.nextInt();
        int b = df.nextInt();
        int c = df.nextInt();
        average(a, b, c);
        df.close();

    }
}
