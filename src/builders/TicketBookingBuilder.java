package builders;

public class TicketBookingBuilder {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;

    public TicketBookingBuilder setMovieTitle(String title) {
        this.movieTitle = title;
        return this;
    }

    public TicketBookingBuilder setSeatNumber(String seat) {
        this.seatNumber = seat;
        return this;
    }

    public TicketBookingBuilder setSnackCombo(String combo) {
        this.snackCombo = combo;
        return this;
    }

    public TicketBooking build() {
        TicketBooking booking = new TicketBooking();
        booking.movieTitle = this.movieTitle;
        booking.seatNumber = this.seatNumber;
        booking.snackCombo = this.snackCombo;
        return booking;
    }
}

