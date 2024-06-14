public class reversestring {
    public static void reverse(String a, int indx) {
        if (indx == 0) {
            System.out.println(a.charAt(indx));
            return;
        }
        System.out.print(a.charAt(indx));
        reverse(a, indx - 1);
    }

    public static void main(String[] args) {
        String a = "abcvjdf";
        reverse(a, a.length() - 1);
    }
}
