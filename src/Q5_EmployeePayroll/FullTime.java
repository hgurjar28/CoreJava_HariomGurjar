package Q5_EmployeePayroll;


class FullTime extends Employee {
    private String name;
    private double hourlyRate;
    private int hoursWorked;

    // Constructor to initialize Full time
    public FullTime(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Override calculateSalary for Full time
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Override getDetails
    @Override
    public String getDetails() {
        return "Full time employee Name: " + name + ", Hourly Rate: ₹" + hourlyRate + ", Hours Worked: " + hoursWorked;
    }
}
