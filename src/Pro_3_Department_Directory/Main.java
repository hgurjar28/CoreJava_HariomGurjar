
//Problem 3: Department Directory with Sorted Employees (Map, List)
//        Maintain a Map<String, List<Employee>> where the key is department name.
//        •	Sort each department’s employees by salary descending.
//        •	Provide a method to return top N paid employees across all departments.
//


package Pro_3_Department_Directory;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory();


        directory.addEmployee(new Employee(1, "Arjun", "HR", 7000));
        directory.addEmployee(new Employee(2, "Binit", "IT", 9500));
        directory.addEmployee(new Employee(3, "Chetan", "HR", 7000));
        directory.addEmployee(new Employee(4, "Devendra", "Finance", 8000));
        directory.addEmployee(new Employee(5, "Ganesh", "IT", 10000));
        directory.addEmployee(new Employee(6, "Hitesh", "Finance", 80000));
        directory.addEmployee(new Employee(7, "Rohan", "Marketing", 6500));
        directory.addEmployee(new Employee(8, "Adity", "Marketing", 6900));
        directory.addEmployee(new Employee(9, "Pooja", "IT", 8800));
        directory.addEmployee(new Employee(10, "Saloni", "Finance", 9400));

        directory.sortEmployeesBySalaryDescending();

        System.out.println("Employees by Department (Sorted by Salary):");
        directory.displayDepartmentEmployees();


        System.out.println("\nTop 5 Paid Employees Across All Departments:");
        List<Employee> topPaid = directory.getTopNPaidEmployees(5);
        for (Employee e : topPaid) {
            System.out.println(e);
        }
    }
}

