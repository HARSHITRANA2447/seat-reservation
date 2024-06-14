import java.util.Scanner;

public class recursion5 {

    public static int power(int n,int x){
      if(x==0 ){
        return 1;
      }
      if(n==0){
        return 0;
      }
      int powe= power(n,x-1);
      int pow= n*powe;
      return pow;
    }
   public static void main(String[] args){
             Scanner df = new Scanner(System.in);
           System.out.println("Enter the Nth number: ");
           int n = df.nextInt();
           System.out.println("Enter the power");
           int x = df.nextInt();
           int ans=power(n, x);
           System.out.println(ans);
           df.close();
   }
}
