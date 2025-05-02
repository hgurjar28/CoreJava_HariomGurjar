package Pro_8_Employee_Hierarchy;

import java.util.*;

public class EmployeeHierarchy {
    private Map<Manager, TreeMap<Integer, List<Employee>>> hierarchy = new HashMap<>();


    public void addEmployee(Manager manager, int level, Employee employee) {

        TreeMap<Integer, List<Employee>> levelMap = hierarchy.get(manager);

        if (levelMap == null) {
            levelMap = new TreeMap<>();
            hierarchy.put(manager, levelMap);
        }

        List<Employee> empList = levelMap.get(level);


        if (empList == null) {
            empList = new ArrayList<>();
            levelMap.put(level, empList);
        }
        empList.add(employee);
    }

    public void printHierarchy() {
        for (Manager manager : hierarchy.keySet()) {
            System.out.println("Manager: " + manager);

            TreeMap<Integer, List<Employee>> levels = hierarchy.get(manager);

            for (Integer level : levels.keySet()) {
                System.out.println("  Level " + level + ":");

                List<Employee> employees = levels.get(level);
                for (Employee emp : employees) {
                    System.out.println("    " + emp);
                }
            }
        }
    }

}
