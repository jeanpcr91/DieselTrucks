import dto.Student;
import dto.Teacher;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Classroom {
    public static void main(String[] args){
        /*
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

         */
        Scanner input = new Scanner(System.in);
        int option = 0;

        String name1;
        String lastName;
        int age;
        int grade;
        String topic;

        do {

            System.out.println("Welcome to Classroom\nChoose an option:");
            System.out.println("1 Add a new student");
            System.out.println("2 Add a ner teacher");
            System.out.println("3 Show the data");
            System.out.println("4 Exit");

            System.out.print("Write your option: ");
            option = input.nextInt();






            switch (option){

                case 1:

                    System.out.print("Enter student's name: ");
                    name1 = input.next();
                    System.out.print("Enter student's last name: ");
                    lastName = input.next();
                    System.out.print("Enter student's age: ");
                    age = input.nextInt();
                    System.out.print("Enter student's grade: ");
                    grade = input.nextInt();

                    List<Student> students = new ArrayList<Student>();
                    Student student1 = new Student(name1, lastName, age, grade);
                    students.add(student1);
                    System.out.println(student1.getString());




                    break;


                case 2:

                    System.out.println("You have choose option 2");

                    break;

                case 3:

                    System.out.println("You have choose option 3");

                    break;

            }


                
        }

        while (option!=4);

        if (option == 4){

            System.out.println("thanks for using it");

        }

        input.close();
    }

    private static void extracted(String name1, String lastName, int age, int grade) {
        System.out.println("name: " + name1 + " lastname: " + lastName + " age: " + age + " grade: " + grade);
    }
}
