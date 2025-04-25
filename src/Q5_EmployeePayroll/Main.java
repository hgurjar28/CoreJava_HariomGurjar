package Q5_EmployeePayroll;

public class Main {
    public static void main(String[] args) {
        // Create instances of FullTimeEmployee and Freelancer
        Employee fullTimeEmployee = new FullTime("John Doe", 50000,2);
        Employee freelancer = new Freelancer("Jane Smith", 500, 10); // ₹500 per hour, 100 hours worked

        // Display details and calculated salaries for each employee
        System.out.println(fullTimeEmployee.getDetails());
        System.out.println("Salary: ₹" + fullTimeEmployee.calculateSalary());

        System.out.println();

        System.out.println(freelancer.getDetails());
        System.out.println("Salary: ₹" + freelancer.calculateSalary());
    }
}

