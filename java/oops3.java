
class student{
    String name;
    int age;
     
    student(String st, int age){
        System.out.println("second ths is ");
        System.out.println(this.name+ " is " +this.age+ " old ");
    }
}

public class oops3 {
    public static void main(String[] args){
        student st = new student("harshit",20);
        st.name="harhs";
    }
}
