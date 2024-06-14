import java.util.*;

public class bubblesort {
    public static void printarray(int a[],int n){
         System.out.println("Sorted array is : " );
        for(int i=0 ; i<n;i++){
            System.out.print(a[i]+ " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the size of Array: ");
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of Array: ");
        for (int i = 0; i < n; i++) {
            a[i] = df.nextInt();
        }
        System.out.println("Your Array is :");
        for( int i =0 ; i<n ; i++){
            System.out.print(a[i]+ " ");
        }
        for(int i = 0; i<a.length-1;i++){
            for(int j = 0 ; j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        printarray(a,n);

        df.close();
    }
}
