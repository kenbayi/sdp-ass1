package factories.movie;

import models.movies.Movie;

public abstract class MovieFactory {
    public abstract Movie createMovie(String title);
}
