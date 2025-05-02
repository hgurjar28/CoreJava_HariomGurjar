
package CollectionHandsOn.Main;
import CollectionHandsOn.Model.Course;
import CollectionHandsOn.Model.Student;
import CollectionHandsOn.Service.RegistrationSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RegistrationSystem system = new RegistrationSystem();

        while (true) {
            System.out.println("\n------ University Course Registration System ------");
            System.out.println("1. Register Student to Course");
            System.out.println("2. Drop Course ");
            System.out.println("3. List Students for Course");
            System.out.println("4. List Courses");
            System.out.println("5. Add Student");
            System.out.println("6. Remove Student");
            System.out.println("7. Add Course");
            System.out.println("8. Remove Course");
            System.out.println("9. View Waitlist for a Course");
            System.out.println("10. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Student ID: ");
                    String sid = scanner.nextLine();
                    System.out.print("Enter Course ID: ");
                    String cid = scanner.nextLine();
                    system.registerStudentToCourse(sid, cid);
                }
                case 2 -> {
                    System.out.print("Enter Student ID: ");
                    String sid = scanner.nextLine();
                    System.out.print("Enter Course ID: ");
                    String cid = scanner.nextLine();
                    system.dropStudentFromCourse(sid, cid);
                }
                case 3 -> {
                    System.out.print("Enter Course ID: ");
                    String cid = scanner.nextLine();
                    system.listStudentsInCourse(cid);
                }
                case 4 ->  system.listCoursesByEnrollment();
                case 5 ->{
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter Year: ");
                    int year = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = scanner.nextLine();

                    Student s = new Student(id, name, email, year, branch);
                    system.addStudent(s);
                }
                case 6 -> {
                    System.out.print("Enter Student ID to remove: ");
                    String id = scanner.nextLine();
                    system.removeStudentFromSystem(id);
                }
                case 7 -> {
                    System.out.print("Enter Course ID: ");
                    String cid = scanner.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = scanner.nextLine();
                    System.out.print("Enter Instructor Name: ");
                    String iname = scanner.nextLine();
                    System.out.print("Enter Capacity: ");
                    int cap = scanner.nextInt(); scanner.nextLine();
                    System.out.print("Enter Credits: ");
                    int credits = scanner.nextInt(); scanner.nextLine();

                    Course course = new Course(cid, cname, iname, cap, credits);
                    system.addCourse(course);
                }

                case 8 -> {
                    System.out.print("Enter Course ID to remove: ");
                    String id = scanner.nextLine();
                    system.removeCourseFromSystem(id);
                }

                case 9 -> {
                    System.out.print("Enter Course ID to view waitlist: ");
                    String cid = scanner.nextLine();
                    system.viewWaitlistForCourse(cid);
                }
                case 10 -> {
                    System.out.println("Exiting system...");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
