import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        int age = df.nextInt();
        if (age > 18) {
            System.out.println("You are able to vote ");
        } else
            System.out.println("you are not eligible for vote");

        df.close();
    }

}
