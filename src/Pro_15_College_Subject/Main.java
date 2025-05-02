
//Problem 15: College Subject Allotment (Map<String, List<String>>)
//        •	Store which subjects are allotted to each student
//        •	Provide reverse lookup: which students chose a specific subject


package Pro_15_College_Subject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClgAllotment clg = new ClgAllotment();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- College Subject Allotment Menu ---");
            System.out.println("1. Add subject for student");
            System.out.println("2. View subjects of a student");
            System.out.println("3. View students by subject");
            System.out.println("4. Display all allotments");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) {
                System.out.print("Enter student name: ");
                String student = sc.nextLine();
                System.out.print("Enter subject name: ");
                String subject = sc.nextLine();
                clg.allotSubject(student, subject);
            } else if (ch == 2) {
                System.out.print("Enter student name: ");
                String student = sc.nextLine();
                clg.getSubjectsForStudent(student);
            } else if (ch == 3) {
                System.out.print("Enter subject name: ");
                String subject = sc.nextLine();
                clg.getStudentsForSubject(subject);
            } else if (ch == 4) {
                clg.printAllotments();
            } else if (ch == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
