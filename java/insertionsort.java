import java.util.Scanner;

public class insertionsort {
    public static void printarray(int a[],int n){
        System.out.println("Sorted array is : " );
       for(int i=0 ; i<n;i++){
           System.out.print(a[i]+ " ");
       }
   }
    public static void main(String[] args){
        System.out.println("Enter the size of Array : ");
        Scanner df = new Scanner(System.in);
        int n = df.nextInt();

        System.out.println("Enter the elements of Array :");
        int[] arr = new int[n];
        for(int i=0 ; i < n ; i++){
            arr[i]= df.nextInt();
        }

        System.out.println("Your given Array is : ");
        for(int i=0 ;i<n; i++){
            System.out.println(arr[i]);
        }

        //insetion sort
     for(int i=1 ; i<arr.length; i++){
        int current = arr[i];
        int j = i-1;
        while(j>=0 && arr[current]< arr[j]){
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] = current ;
     }

     printarray(arr, n);
         
        df.close();
    }
}
