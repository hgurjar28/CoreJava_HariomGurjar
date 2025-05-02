
package CollectionHandsOn.Service;
import CollectionHandsOn.Model.Course;
import CollectionHandsOn.Model.Student;
import CollectionHandsOn.Util.Sorter;

import java.util.*;

public class RegistrationSystem {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();


    public void addStudent(Student student) {
        if (students.containsKey(student.getId())) {
            System.out.println("Student already exists.");
        } else {
            students.put(student.getId(), student);
            System.out.println("Student added.");
        }
    }


    public void removeStudentFromSystem(String studentId) {
        Student student = students.remove(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        for (Course course : courses.values()) {
            if (course.getEnrolledStudents().remove(student)) {
                if (!course.getWaitlist().isEmpty()) {
                    Student promoted = course.getWaitlist().poll();
                    course.getEnrolledStudents().add(promoted);
                    System.out.println("Promoted waitlisted student: " + promoted.getName() +
                            " in course: " + course.getCourseName());
                }
            }
            course.getWaitlist().remove(student);
        }

        System.out.println("Student  Removed.");
    }


    public void addCourse(Course course) {
        if (courses.containsKey(course.getCourseId())) {
            System.out.println("Course already exists.");
        } else {
            courses.put(course.getCourseId(), course);
            System.out.println("Course added.");
        }
    }


    public void removeCourseFromSystem(String courseId) {
        Course removed = courses.remove(courseId);
        if (removed == null) {
            System.out.println("Course not found.");
        } else {
            System.out.println("Course removed: " + removed.getCourseName());
        }
    }


    public void registerStudentToCourse(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student == null || course == null) {
            System.out.println("Invalid student or course ID.");
            return;
        }

        boolean enrolled = course.enrollStudent(student);
        if (enrolled) {
            System.out.println("Student enrolled in course.");
        } else {
            System.out.println("Course full. Student added to waitlist.");
        }
    }


    public void dropStudentFromCourse(String studentId, String courseId) {
        Student student = students.get(studentId);
        Course course = courses.get(courseId);

        if (student == null || course == null) {
            System.out.println("Invalid student or course ID.");
            return;
        }

        boolean dropped = course.dropStudent(student);
        if (dropped) {
            System.out.println("Student dropped from course.");
        } else {
            System.out.println("Student not found in course or waitlist.");
        }
    }

    public void listStudentsInCourse(String courseId) {
        Course course = courses.get(courseId);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        Set<Student> enrolled = course.getEnrolledStudents();
        if (enrolled.isEmpty()) {
            System.out.println("No students enrolled in this course.");
            return;
        }

        List<Student> sorted = Sorter.sortStudentsByName(enrolled);
        System.out.println("Students in course: " + course.getCourseName());
        for (Student s : sorted) {
            System.out.println(s);
        }
    }


    public void listCoursesByEnrollment() {
        List<Course> sorted = Sorter.sortCoursesByEnrollment(courses.values());
        if (sorted.isEmpty()) {
            System.out.println("No courses available.");
            return;
        }

        System.out.println("Courses sorted by enrollment:");
        for (Course c : sorted) {
            System.out.printf("%s (%s) - Enrolled: %d | Waitlist: %d%n",
                    c.getCourseName(), c.getCourseId(),
                    c.getEnrolledStudents().size(),
                    c.getWaitlist().size());
        }
    }


    public void viewWaitlistForCourse(String courseId) {
        Course course = courses.get(courseId);
        if (course == null) {
            System.out.println("Course not found.");
            return;
        }

        Queue<Student> waitlist = course.getWaitlist();
        if (waitlist.isEmpty()) {
            System.out.println("No students in the waitlist for this course.");
        } else {
            System.out.println("Waitlisted students for course: " + course.getCourseName());
            for (Student student : waitlist) {
                System.out.println(student);
            }
        }
    }
}
