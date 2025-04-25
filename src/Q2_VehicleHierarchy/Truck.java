package Q2_VehicleHierarchy;

// Truck.java
public class Truck extends Vehicle {

    // Constructor
    public Truck(int speed, double fuelPerLiter) {
        super(speed, fuelPerLiter);
    }

    // Override mileage calculation for Truck
    @Override
    public double getMileage() {
        return (speed * fuelPerLiter) / 100.0;
    }
}

