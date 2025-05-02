package Pro_13_Flight_Booking;
import java.util.*;

public class FlightBooking {

    private Queue<BookingRequest> bookingQueue = new LinkedList<>();
    private Map<String, Integer> confirmedBookings = new HashMap<>();
    private int nextSeatNumber=1;

    public void addBookingRequest(BookingRequest request) {
        bookingQueue.add(request);
    }

    public void processBookings() {
        if (bookingQueue.isEmpty()) {
            System.out.println("No pending bookings to process.");
            return;
        }

        while (!bookingQueue.isEmpty()) {
            BookingRequest request = bookingQueue.poll();
            confirmedBookings.put(request.getPassengerName(), nextSeatNumber++);
        }

        System.out.println("All pending bookings have been processed.");
    }

    public void printConfirmedBookings() {
        if (confirmedBookings.isEmpty()) {
            System.out.println("No confirmed bookings yet.");
            return;
        }

        System.out.println("Confirmed Bookings:");

        for (String name : confirmedBookings.keySet()) {
            int seat = confirmedBookings.get(name);
            System.out.println(name + " - Seat: " + seat);
        }

    }
}
