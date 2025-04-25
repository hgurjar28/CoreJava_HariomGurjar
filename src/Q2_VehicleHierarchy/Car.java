package Q2_VehicleHierarchy;

// Car.java
public class Car extends Vehicle {

    // Constructor
    public Car(int speed, double fuelPerLiter) {
        super(speed, fuelPerLiter);
    }

    // Override mileage calculation for Car
    @Override
    public double getMileage() {
        return (speed * fuelPerLiter) / 100.0;
    }
}
