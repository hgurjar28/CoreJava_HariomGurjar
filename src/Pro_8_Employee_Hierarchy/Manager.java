package Pro_8_Employee_Hierarchy;

public class Manager {
    private String name;
    private int id;

    public Manager(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Manager: " + id + " - " + name;
    }
}
