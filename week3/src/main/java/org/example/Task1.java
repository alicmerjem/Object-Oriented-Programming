package org.example;
import java.util.*;

public class Task1 {
    public static void addRating(ArrayList<MovieRating> ratings, MovieRating rating) {
        ratings.add(rating);
    }

    public static void showRatings(ArrayList<MovieRating> ratings) {
        for (MovieRating rating : ratings) {
            System.out.println(rating);
        }
    }

    public static void main(String[] args) {
        ArrayList<MovieRating> ratings = new ArrayList<MovieRating>();
        MovieRating rating = MovieRating.G;
        addRating(ratings, rating);
        showRatings(ratings);
    }
}

enum MovieRating {
    G, PG, PG13, R
}
