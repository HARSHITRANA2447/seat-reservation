import java.util.*;

public class comparestring {
    public static void main(String args[]) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the first Name :");
        String a = df.nextLine();
        System.out.println("Enter the second Name :");
        String b = df.nextLine();

        if (a.compareTo(b) == 0) {
            System.out.println("They have same names");
            System.out.println(a);
        } else {
            System.out.println("Their names are different");
            System.out.println(b);
        }
        df.close();

    }

}
