package Q6_StudentRegistry;

public class Student {

    private static int totalStudents = 0;

    private int studentId;
    private  String name;

//    Constructor to initialize students
    public Student(String name){
        this.name =name;
        this.studentId = ++totalStudents;
    }
    public void displayDetails(){
        System.out.println("Student Id: "+studentId+" Name: "+name);
    }
    public static int getTotalStudents(){
        return totalStudents;
    }

}
