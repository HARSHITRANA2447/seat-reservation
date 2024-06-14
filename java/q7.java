import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.println("Eneter 1 to continue and 0 to stop");
        int n = df.nextInt();
        int positive = 0, negative = 0, zero = 0;

        while (n == 1) {
            System.out.println("Enter your number ");
            int num = df.nextInt();
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else
                zero++;
            System.out.println("press 1 to continue and 0 to stop ");
            n = df.nextInt();
        }
        System.out.println("Postitive :" + positive);
        System.out.println("Negative  :" + negative);
        System.out.println("Zero :" + zero);
        df.close();
    }

}
