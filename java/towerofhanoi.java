import java.util.Scanner;

public class towerofhanoi {
    public static void tower(int n , String src , String help, String dest){
       if(n==1){
        System.out.println("transfer disk "+n+" from " +src+" to "+dest);
        return;
       }
        tower(n-1,src, dest, help);
        System.out.println("transfer disk "+n+" from " +src+" to "+dest);
        tower(n-1, help,src,dest);
    }
    public static void main(String[] args){
        Scanner df= new Scanner(System.in);
        System.out.println("Enter the number of Disks:");
        int n = df.nextInt();
        tower(n,"s","h","d");
        df.close();
    
    }
}
