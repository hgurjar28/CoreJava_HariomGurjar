package Q2_VehicleHierarchy;

// Vehicle.java
public class Vehicle {
    protected int speed;
    protected double fuelPerLiter;

    // Constructor
    public Vehicle(int speed, double fuelPerLiter) {
        this.speed = speed;
        this.fuelPerLiter = fuelPerLiter;
    }

    // Method to be overridden by subclasses
    public double getMileage() {
        return 0.0;
    }
}

