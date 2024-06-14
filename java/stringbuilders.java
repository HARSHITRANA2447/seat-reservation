import java.util.*;

public class stringbuilders {
    public static void main(String args[]) {
        System.out.println("Enter the Sentence for stringbuilder:");
        Scanner df = new Scanner(System.in);
        String str = df.nextLine();

        StringBuilder st = new StringBuilder(str);
        System.out.println("Your Sentence in StringBuilder is :" + st);

        System.out.println("Enter the Index value :");
        int n = df.nextInt();

        System.out.println("Element at Index " + n + " : " + st.charAt(n));

        System.out.println("sentence after setting character");
        st.setCharAt(5, 'a');
        System.out.println(st);

        System.out.println("sentece after inserting a new character");
        st.insert(6, 'S');
        System.out.println(st);

        System.out.println(" sentence after deleting a element ");
        st.delete(2, 5);
        System.out.println(st);

        st.append("null");
        st.append("str");
        df.close();
    }
}
