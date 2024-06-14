import java.util.Scanner;

public class q4 {
    public static void circum(double radi) {
        double circumference = 0;
        circumference = 2 * radi * 3.14;
        System.out.println("The circumference of the given radius is " + circumference);
        return;
    }

    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        double radi = df.nextInt();
        df.close();
        circum(radi);
    }
}
