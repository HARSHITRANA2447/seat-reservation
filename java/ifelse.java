import java.util.*;

public class ifelse {
    public static void main(String args[]) {
        Scanner ag = new Scanner(System.in);
        int age = ag.nextInt();
        ag.close();
        if (age < 18) {
            System.out.println("you are young for this content");
        } else
            System.out.println("Adult");
    }

}
