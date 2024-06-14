import java.util.Scanner;

public class selectionsort {
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

        for(int i=0 ; i<arr.length-1;i++){
            int smallest = i;
            for(int j =i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]= arr[i];
            arr[i]=temp;
        }
        System.out.println("Your sorted Array is : ");
        for(int i =0 ; i<n; i++){
            System.out.print(arr[i]+ " ");
        }
        df.close();
    }
}
