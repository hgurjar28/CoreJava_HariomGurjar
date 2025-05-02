package Pro_13_Flight_Booking;

public class BookingRequest {
    private String passengerName;

    public BookingRequest(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPassengerName() {
        return passengerName;
    }
    @Override
    public String toString() {
        return "Passenger: " + passengerName;
    }
}