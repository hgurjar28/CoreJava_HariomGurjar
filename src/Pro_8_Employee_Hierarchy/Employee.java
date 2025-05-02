package Pro_8_Employee_Hierarchy;

public class Employee {
    private String name;
    private int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    @Override
    public String toString() {
        return id + " - " + name;
    }
}
