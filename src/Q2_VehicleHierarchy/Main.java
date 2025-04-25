package Q2_VehicleHierarchy;

// VehicleApp.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Car
        System.out.print("Enter the speed of the car (KM/H): ");
        int carSpeed = scanner.nextInt();

        System.out.print("Enter the mileage of the car (per liter): ");
        double carFuel = scanner.nextDouble();

        Car car = new Car(carSpeed, carFuel);
        System.out.println("Car mileage: " + car.getMileage() + " km/l");

        // Input for Truck
        System.out.print("Enter the speed of the truck (KM/H): ");
        int truckSpeed = scanner.nextInt();

        System.out.print("Enter the mileage of the truck (per liter): ");
        double truckFuel = scanner.nextDouble();

        Truck truck = new Truck(truckSpeed, truckFuel);
        System.out.println("Truck mileage: " + truck.getMileage() + " km/l");

        scanner.close();
    }
}
