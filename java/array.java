java.util.Scanner;
class Solution {
    public int differenceOfSums(int n, int m) {
        int num1=0;
        int num2 =0;
        
        for(int i=1; i<=n;i++){
            if(i%3 != 0){
                  num1 +=i;
            }
            else{
                num2 +=i;
            }
        }
        return num1-num2;
    }
    public static void main(String[] args){
        Scanner df= new Scanner(System.in);
        int n = df.nextInt();
        int m = df.nextInt();
        int result = differenceOfSums(n,m);
        System.out.print(result);
        df.close();
    }
}