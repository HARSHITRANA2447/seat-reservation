import java.util.Scanner;

public class strings {
    public static void main(String args[]) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter your Email id :");
        String email = df.nextLine();
        System.out.println("Enter your college name :");
        String college = df.nextLine();
        System.out.println("Your Email id is " + email + " and your college is " + college);
        // joining two strings
        String fullname = email + " " + college;
        System.out.println(fullname);
        df.close();
    }
}