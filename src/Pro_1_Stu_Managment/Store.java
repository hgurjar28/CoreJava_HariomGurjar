package Pro_1_Stu_Managment;

import java.util.*;

public class Store
{
    ArrayList<Student> list= new ArrayList<>();

    public void add(Student student)
    {

        list.add(student);
    }

    public void displayAll()
    {
        if(list.isEmpty())
        {
            System.out.println("Student List is Empty : {}");
            return;
        }
        for (Student s : list) {
            System.out.println(s);
        }
    }
    public void sortByBranchAndGrad()
    {

        list.sort(Comparator.comparing((Student s)->s.branch).thenComparing(Comparator.comparingDouble((Student s) -> s.grade).reversed()));
    }
    public void groupByBranch() {
        Map<String, List<Student>> grouped = new HashMap<>();
        for (Student s : list) {
            grouped.computeIfAbsent(s.branch, k -> new ArrayList<>()).add(s);
        }
        for (String branch : grouped.keySet()) {
            System.out.println("Branch: " + branch);
            for (Student s : grouped.get(branch)) {
                System.out.println(s);
            }
        }
    }
}
