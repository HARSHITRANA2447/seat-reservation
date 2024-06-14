import java.util.Scanner;

class students{
     String name;
     int rollno;
     public void printinfo(){
        System.out.println(name);
        System.out.println(rollno);
}
}

public class oops2input {
   public static void main(String[] args){
      Scanner df = new Scanner(System.in);
      System.out.println("enter the name: ");
      students st1= new students();
      st1.name=df.nextLine();
      System.out.println("Enter the roll no: ");
      st1.rollno=df.nextInt();
      st1.printinfo();
      df.close();
      
   }
    
}
