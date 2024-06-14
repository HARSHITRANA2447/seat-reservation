public class firstlastelemnt {
    public static int first = -1;
    public static int last = -1;

    public static void find(String st, int idx, char element) {
        if (idx == st.length()) {
            System.out.println(first);
            System.out.println(last);
        }
        char currentchar = st.charAt(idx);
        if (currentchar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
    }

    public static void main(String[] args) {
        String str = "kjanfsfaksadf";
        find(str, 0, 'k');

    }
}
