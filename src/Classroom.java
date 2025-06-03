import dto.Student;
import dto.Teacher;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Classroom {
    public static void main(String args[]){
        List<Student> students = new ArrayList<Student>();
        Student student1 = new Student("Jean Paul", "Cruz Rivas", 33, 9);
        students.add(student1);
        Student student2 = new Student("Diana Ysabel", "Llanos Quispe", 31, 12);
        students.add(student2);
        Student student3 = new Student("Magally Mavel", "Cruz Rivas", 43, 9);
        students.add(student3);
        Student student4 = new Student("Juan Diego", "Llanos Quispe", 13, 7);
        students.add(student4);
        Student student5 = new Student("Abigail Belen", "Cruz Rivas", 25, 10);
        students.add(student5);

        System.out.println("\nSTUDENT'S LIST\n");

        for(Student student:students){
            System.out.println(student.getString());
        }
        //System.out.println(student1.getString());
        List<Teacher> teachers = new ArrayList<Teacher>();

        Teacher teacher1 = new Teacher("David Rogers", "Cruz Rivas", 33, new String[]{"Math", "Language"});
        teachers.add(teacher1);
        Teacher teacher2 = new Teacher("Diana Ysabel", "Llanos Quispe", 31, new String[]{"Science", "Besuqueo"});
        teachers.add(teacher2);

        System.out.println("\nTEACHER'S LIST\n");


        for (Teacher teacher:teachers){
            System.out.println(teacher.getString());
        }

    }
}
