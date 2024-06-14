import java.util.*;

public class loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        // for (int i = 0; i < a; i++) {
        // System.out.println("hello ");
        // }
        // for (int i = 0; i <= a; i++) {
        // System.out.println(i);
        // }

        // int i = 0;
        // while (i < a) {
        // System.out.println(i);
        // i++;
        // }

        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < a);
        sc.close();
    }
}
