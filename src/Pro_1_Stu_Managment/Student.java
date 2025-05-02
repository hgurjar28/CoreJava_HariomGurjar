package Pro_1_Stu_Managment;

public class Student
{
    public int id;
    public String name;
    public int age;
    public double grade;
    public String branch;

    public Student(int id,String name,int age, double grade,String branch)
    {
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.branch=branch;
    }

    @Override


    public String toString() {
        return "Student {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", branch='" + branch + '\'' +
                '}';
    }
}