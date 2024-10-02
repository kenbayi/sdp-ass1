package prototypes;

import models.movies.Movie;

public interface MovieSchedule extends Cloneable {
    MovieSchedule clone();
    void setMovie(Movie movie);
    String getMovie();
    String getTime();
}
