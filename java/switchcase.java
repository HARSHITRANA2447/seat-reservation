import java.util.*;

public class switchcase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("rom rom ji");
                break;
            case 4:
                System.out.println("bonjour");
                break;
            case 5:
                System.out.println("guten taag");
        }
        sc.close();
    }
}
