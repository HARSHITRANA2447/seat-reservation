
import java.util.Scanner;

public class greater$less {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner nu = new Scanner(System.in);
        int a = nu.nextInt();
        int b = nu.nextInt();

        if (a < b) {
            System.out.println("B is bigger");
        } else if (a > b) {
            System.out.println("A is bigger");
        } else
            System.out.println("they are equal");
        nu.close();
    }
}
