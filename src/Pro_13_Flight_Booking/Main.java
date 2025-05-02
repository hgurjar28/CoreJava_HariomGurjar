
//Problem 13: Flight Booking Manager (Queue, Map)
//        Use a Queue for booking requests and a Map for confirmed bookings.
//        •	Process bookings FIFO and update map with seat numbers.


package Pro_13_Flight_Booking;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightBooking system = new FlightBooking();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Flight Booking Menu ---");
            System.out.println("1. Add Booking");
            System.out.println("2. Process Booking");
            System.out.println("3. Show Confirmed Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter passenger name: ");
                String passengerName = scanner.nextLine();
                system.addBookingRequest(new BookingRequest(passengerName));

            } else if (choice == 2) {
                system.processBookings();
            } else if (choice == 3) {
                system.printConfirmedBookings();
            } else if (choice == 4) {
                System.out.println("Exiting...");
            } else {
                System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        scanner.close();
    }
}
