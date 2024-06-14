import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String sentence = df.nextLine();
        System.out.println("Enter the begning of word");
        int n = df.nextInt();
        System.out.println("Enter the ending of word");
        int m = df.nextInt();
        String word = sentence.substring(n, m);
        System.out.println("the subgroup is :" + word);
        df.close();
    }
}
