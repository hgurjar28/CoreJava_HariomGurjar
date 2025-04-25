package Q6_StudentRegistry;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Raj");
        Student s2 = new Student("Lalit");
        Student s3 = new Student("Ramesh");
        Student s4 = new Student("Sudeep");

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
        s4.displayDetails();

        System.out.println("Total number of students: " + Student.getTotalStudents());

    }
}
