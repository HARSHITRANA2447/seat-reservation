import java.util.*;

public class stringreverse {
    public static void main(String args[]) {
        Scanner df = new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String a = df.nextLine();
        StringBuilder st = new StringBuilder(a);

        for (int i = 0; i < st.length() / 2; i++) {
            int front = i;
            int last = st.length() - 1 - i;
            char frontchar = st.charAt(front);
            char lastchar = st.charAt(last);

            st.setCharAt(front, lastchar);
            st.setCharAt(last, frontchar);
        }
        System.out.println("sentence after reversing it is :");
        System.out.println(st);
        df.close();
    }
}
