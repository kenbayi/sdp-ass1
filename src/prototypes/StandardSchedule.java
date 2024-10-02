package prototypes;

import models.movies.Movie;

public class StandardSchedule implements MovieSchedule {
    private String time;
    private Movie movie;

    public void setTime(String time) {
        this.time = time;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public String getMovie() {
        return movie.getTitle();
    }

    public String getTime() {
        return time;
    }

    public MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
