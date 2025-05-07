
//From a list of students with names and grades, return a list of names of students who scored above 80, sorted alphabetically.
package FunctionalProExercise.Q_32_StudentScore;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighScorers {


    static class Student {
        String name;
        int grade;

        Student(String name, int grade) {
            this.name = name;
            this.grade = grade;
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Aman", 95),
                new Student("Deepak", 70),
                new Student("Raj", 85)
        );

        List<String> result = students.stream()
                .filter(s -> s.grade > 80)
                .map(s -> s.name)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Top students: " + result);
    }
}
