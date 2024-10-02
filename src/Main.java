import builders.TicketBooking;
import builders.TicketBookingBuilder;
import config.CinemaConfig;
import factories.movie.MovieFactory;
import factories.movie.RegularMovieFactory;
import factories.ui.DarkThemeFactory;
import factories.ui.UIFactory;
import models.movies.Movie;
import models.ui.Button;
import prototypes.MovieSchedule;
import prototypes.StandardSchedule;

public class Main {
    public static void main(String[] args) {
// Singleton usage
        CinemaConfig config = CinemaConfig.getInstance();
        config.setCinemaName("Starlight Cinemas");
        System.out.println("Cinema Name: " + config.getCinemaName());
// Factory Method usage
        MovieFactory regularFactory = new RegularMovieFactory();
        Movie movie = regularFactory.createMovie("Inception");
        System.out.println("Movie: " + movie.getTitle() + ", Type: " + movie.getType());
// Abstract Factory usage
        UIFactory uiFactory = new DarkThemeFactory();
        Button button = uiFactory.createButton();
        button.render();
// Builder usage
        TicketBooking booking = new TicketBookingBuilder()
                .setMovieTitle("Inception")
                .setSeatNumber("A1")
                .setSnackCombo("Popcorn and Soda")
                .build();
        System.out.println("Title: " + booking.getMovieTitle() + ", Your Seat Number: " + booking.getSeatNumber() + ", Snack Combo: " + booking.getSnackCombo());
// Prototype usage
        StandardSchedule template = new StandardSchedule();
        template.setTime("18:00");
        MovieSchedule eveningSchedule = template.clone();
        eveningSchedule.setMovie(movie);
        System.out.println("Movie: " + eveningSchedule.getMovie() + ", Time: " + eveningSchedule.getTime() );
        System.out.println("Cinema Management System initialized.");
    }
}