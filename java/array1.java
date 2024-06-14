import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        System.out.println("Enter the number of size of class");
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the marks of " + n + " students");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = df.nextInt();
            if (arr[i] < 32) {
                System.out.println("chall sala fail ha " + i + " iske to " + arr[i]);
            } else {
                continue;
            }
        }

        df.close();
    }
}
