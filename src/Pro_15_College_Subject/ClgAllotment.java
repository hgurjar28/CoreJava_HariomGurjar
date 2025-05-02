package Pro_15_College_Subject;

import java.util.*;

public class ClgAllotment {
    private Map<String, List<String>> studentSubjects = new HashMap<>();
    private Map<String, List<String>> subjectStudents = new HashMap<>();

    public void allotSubject(String student, String subject) {

        if (!studentSubjects.containsKey(student)) {
            studentSubjects.put(student, new ArrayList<>());
        }
        studentSubjects.get(student).add(subject);

        if (!subjectStudents.containsKey(subject)) {
            subjectStudents.put(subject, new ArrayList<>());
        }
        subjectStudents.get(subject).add(student);


        System.out.println("Subject \"" + subject + "\" allotted to student \"" + student + "\".");
    }

    public void getSubjectsForStudent(String student) {

        if (studentSubjects.containsKey(student)) {
            List<String> subjects = studentSubjects.get(student);
            System.out.println("Subjects allotted to \"" + student + "\": " + subjects);
        } else {
            System.out.println("No subjects found for student \"" + student + "\".");
        }
    }

    public void getStudentsForSubject(String subject) {

        if (subjectStudents.containsKey(subject)) {
            List<String> students = subjectStudents.get(subject);
            System.out.println("Students enrolled in subject \"" + subject + "\": " + students);
        } else {
            System.out.println("No students found for subject \"" + subject + "\".");
        }
    }

    public void printAllotments() {
        System.out.println("Student -> Subjects:");
        for (String student : studentSubjects.keySet()) {
            System.out.println(student + " -> " + studentSubjects.get(student));
        }
    }
}
