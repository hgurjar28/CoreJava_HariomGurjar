package CollectionHandsOn.Model;
import java.util.*;

public class Course {

    private String courseId;
    private String courseName;
    private String instructorName;
    private int capacity;
    private int credits;


    private Set<Student> enrolledStudents;


    private Queue<Student> waitlist;


    public Course(String courseId, String courseName, String instructorName, int capacity, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.capacity = capacity;
        this.credits = credits;


        this.enrolledStudents = new TreeSet<>(Comparator.comparing(Student::getName));


        this.waitlist = new LinkedList<>();
    }


    public String getCourseId() { return courseId; }
    public String getCourseName() { return courseName; }
    public Set<Student> getEnrolledStudents() { return enrolledStudents; }
    public Queue<Student> getWaitlist() { return waitlist; }


    public boolean enrollStudent(Student student) {

        if (enrolledStudents.contains(student) || waitlist.contains(student)) {
            return false;
        }


        if (enrolledStudents.size() < capacity) {
            enrolledStudents.add(student);
            return true;
        } else {

            waitlist.add(student);
            return false;
        }
    }


    public boolean dropStudent(Student student) {

        if (enrolledStudents.remove(student)) {
            if (!waitlist.isEmpty()) {
                Student nextStudent = waitlist.poll();
                enrolledStudents.add(nextStudent);
            }
            return true;
        } else if (waitlist.remove(student)) {
            return true;
        }
        return false;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return courseId.equals(course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }


    @Override
    public String toString() {
        return "Course{courseId='" + courseId + "', courseName='" + courseName +
                "', instructorName='" + instructorName + "', capacity=" + capacity +
                ", credits=" + credits + ", enrolled=" + enrolledStudents.size() +
                ", waitlisted=" + waitlist.size() + "}";
    }

}
