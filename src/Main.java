import data.Student;
import data.Teacher;
import data.User;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("ivan", "ivanov",
                "25.07.1997", 25);
       Teacher teacher = new Teacher("ivan1", "ivanov",
                "25.07.1965", "IT");




        System.out.println(student.toString());
        System.out.println(teacher.toString());
    }

}
