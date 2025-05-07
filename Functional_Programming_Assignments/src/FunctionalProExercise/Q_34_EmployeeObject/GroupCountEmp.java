
//Given a list of Employee objects, group them by department and count how many employees are in each department.
package FunctionalProExercise.Q_34_EmployeeObject;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCountEmp {


    static class Employee {
        String name;
        String department;

        Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }
    }

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Priya", "HR"),
                new Employee("Rashi", "IT"),
                new Employee("Chetan", "IT"),
                new Employee("Dinesh", "HR")
        );


        Map<String, Long> countByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.counting()
                ));

        System.out.println("Employee count by department: " + countByDept);

    }
}
