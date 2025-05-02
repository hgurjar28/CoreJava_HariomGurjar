
//Problem 8: Employee Hierarchy System (Map, TreeMap)
//Maintain a hierarchy with Map<Manager, TreeMap<Level, List<Employee>>>.
//•	Print employees reporting to a manager at each level.


package Pro_8_Employee_Hierarchy;

public class Main {
    public static void main(String[] args) {
        EmployeeHierarchy system = new EmployeeHierarchy();

        Manager m1 = new Manager(1, "Ramu");
        Manager m2 = new Manager(2, "Karan");

        system.addEmployee(m1, 1, new Employee(101, "Jitu"));
        system.addEmployee(m1, 2, new Employee(102, "Ritik"));
        system.addEmployee(m1, 1, new Employee(103, "Manish"));

        system.addEmployee(m2, 1, new Employee(201, "Hitesh"));
        system.addEmployee(m2, 1, new Employee(202, "Roshan"));
        system.addEmployee(m2, 2, new Employee(203, "Sudeep"));

        system.printHierarchy();
    }
}
