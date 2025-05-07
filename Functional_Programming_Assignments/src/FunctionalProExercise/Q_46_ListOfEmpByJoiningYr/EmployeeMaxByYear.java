
//Write a program that groups a list of employees by joining year, and then finds the max salary in each year.
package FunctionalProExercise.Q_46_ListOfEmpByJoiningYr;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMaxByYear {
    public static void main(String[] args) {
        class Employee {
            String name;
            int year;
            double salary;

            public Employee(String name, int year, double salary) {
                this.name = name;
                this.year = year;
                this.salary = salary;
            }
        }

        List<Employee> employees = Arrays.asList(
                new Employee("Mohit", 2020, 50000),
                new Employee("Rajat", 2020, 60000),
                new Employee("Chetan", 2021, 70000),
                new Employee("Dinesh", 2021, 55000)
        );

        Map<Integer, Optional<Employee>> maxSalaryByYear = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.year,
                        Collectors.maxBy(Comparator.comparingDouble(e -> e.salary))
                ));

        maxSalaryByYear.forEach((year, employeeOpt) -> {
            String result = employeeOpt.map(e -> e.name + " ($" + e.salary + ")").orElse("No data");
            System.out.println("Year " + year + ": " + result);
        });
    }
}

