package CollectionHandsOn.Util;
import java.util.*;
import CollectionHandsOn.Model.Student;
import CollectionHandsOn.Model.Course;

public class Sorter {

    public static List<Student> sortStudentsByName(Collection<Student> students) {
        List<Student> list = new ArrayList<>(students);
        list.sort(Comparator.comparing(Student::getName));
        return list;
    }

    public static List<Course> sortCoursesByEnrollment(Collection<Course> courses) {
        List<Course> list = new ArrayList<>(courses);
        list.sort((c1, c2) -> Integer.compare(
                c2.getEnrolledStudents().size(),
                c1.getEnrolledStudents().size())
        );
        return list;
    }

}
