package dto;

public class Student extends Person{

    public Student(){

    }

    public Student(String name, String lastName, int age, int grade){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.grade = grade;
    }

    public String getString(){
        return ("Name: "+ name+" , LastName: "+lastName+ " , Age: "+ age
        + " , Grade: " + grade);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    int grade;
}
