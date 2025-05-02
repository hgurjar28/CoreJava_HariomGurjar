
package Pro_3_Department_Directory;

import java.util.*;

public class Directory {


    private  Map<String, List<Employee>> departmentMap = new HashMap<>();

    public void addEmployee(Employee emp) {

        departmentMap.computeIfAbsent(emp.getDepartment(), k -> new ArrayList<>())
                .add(emp);
    }

    public void sortEmployeesBySalaryDescending() {
        for (List<Employee> empList : departmentMap.values()) {
            empList.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        }
    }

    public void displayDepartmentEmployees() {
        for (String dept : departmentMap.keySet()) {
            System.out.println("Department: " + dept);
            for (Employee emp : departmentMap.get(dept)) {
                System.out.println("  " + emp);
            }
        }
    }

    public List<Employee> getTopNPaidEmployees(int n) {
        List<Employee> allEmployees = new ArrayList<>();
        for (List<Employee> list : departmentMap.values()) {
            allEmployees.addAll(list);
        }

        allEmployees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        return allEmployees.subList(0, Math.min(n, allEmployees.size()));
    }
}
