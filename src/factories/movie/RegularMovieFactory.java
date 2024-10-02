package factories.movie;

import models.movies.Movie;
import models.movies.RegularMovie;

public class RegularMovieFactory extends MovieFactory {
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}
