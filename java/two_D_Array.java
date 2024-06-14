import java.util.*;

public class two_D_Array {
    public static void main(String[] args) {

        Scanner df = new Scanner(System.in);
        System.out.println("Enter the number of Rows of array :");
        int n = df.nextInt();
        System.out.println("Enter the number of Columns");
        int m = df.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter the elements of Array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = df.nextInt();
            }
        }
        System.out.println("Your Matrix is here : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        df.close();
    }
}
