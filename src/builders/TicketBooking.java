package builders;

public class TicketBooking {
    String movieTitle;
    String seatNumber;
    String snackCombo;

    TicketBooking() { }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String getSnackCombo() {
        return snackCombo;
    }

    public static TicketBookingBuilder builder() {
        return new TicketBookingBuilder();
    }
}
