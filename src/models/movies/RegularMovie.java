package models.movies;

public class RegularMovie implements Movie {
    private String title;
    public RegularMovie(String title) { this.title = title; }
    public String getTitle() { return title; }
    public String getType() { return "Regular"; }
}
