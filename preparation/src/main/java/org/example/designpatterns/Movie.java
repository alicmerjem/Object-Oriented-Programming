package org.example.designpatterns;

public class Movie {
    private final String title;
    private final String director;
    private final int releaseYear;
    private final boolean hasWonAwards;

    private Movie(MovieBuilder builder) {
        this.title = builder.title;
        this.director = builder.director;
        this.releaseYear = builder.releaseYear;
        this.hasWonAwards = builder.hasWonAwards;
    }

    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public int getReleaseYear() { return releaseYear; }
    public boolean getHasWonAwards() { return hasWonAwards; }

    public static class MovieBuilder {
        private final String title;
        private final String director;
        private int releaseYear;
        private boolean hasWonAwards;

        public MovieBuilder(String title, String director) {
            this.title = title;
            this.director = director;
        }

        public MovieBuilder releaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return this;
        }

        public MovieBuilder hasWonAwards(boolean hasWonAwards) {
            this.hasWonAwards = hasWonAwards;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
