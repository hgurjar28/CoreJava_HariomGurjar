
//Problem 1: Advanced Student Management (List, Comparator, Map)
//
//Create a Student class with id, name, age, grade, and branch.
//        •	Store at least 15 students in an ArrayList.
//        •	Sort students by branch, then by descending grade.
//•	Group students by branch using a Map<String, List<Student>>.


package Pro_1_Stu_Managment;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Welcome to Student Management System");
        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int choice;
        do {
            System.out.println("\n1. Display all Students");
            System.out.println("2. Sort students by branch and descending grade");
            System.out.println("3. Group students by branch");
            System.out.println("4. Add a new student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    store.displayAll();
                    break;
                case 2:
                    store.sortByBranchAndGrad();
                    System.out.println("Students sorted by branch and grade:");
                    store.displayAll();
                    break;
                case 3:
                    store.groupByBranch();
                    break;
                case 4:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter Grade: ");
                    double grade = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    store.add(new Student(id, name, age, grade, branch));
                    System.out.println("Student added.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}
