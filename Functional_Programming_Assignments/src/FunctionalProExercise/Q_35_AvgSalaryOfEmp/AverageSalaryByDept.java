
//Calculate the average salary of employees in each department using Collectors.groupingBy() and averagingDouble().
package FunctionalProExercise.Q_35_AvgSalaryOfEmp;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AverageSalaryByDept {


    static class Emp {
        String department;
        double salary;

        Emp(String department, double salary) {
            this.department = department;
            this.salary = salary;
        }
    }

    public static void main(String[] args) {
        List<Emp> emps = Arrays.asList(
                new Emp("IT", 60000),
                new Emp("IT", 70000),
                new Emp("HR", 50000),
                new Emp("HR", 30000)
        );


        Map<String, Double> avgSalary = emps.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.averagingDouble(e -> e.salary)
                ));

        System.out.println("Average salary by department: " + avgSalary);

    }
}
