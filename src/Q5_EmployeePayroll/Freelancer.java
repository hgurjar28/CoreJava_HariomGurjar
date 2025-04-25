package Q5_EmployeePayroll;

class Freelancer extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize Freelancer
    public Freelancer(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override calculateSalary for Freelancer
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }


    @Override
    public String getDetails() {
        return "Freelancer Name: " + name + ", Hourly Rate: ₹" + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
