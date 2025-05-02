
package Pro_7_Movie_Rating;

import java.util.*;

public class MovieRatingAggregator {
    private Map<String, Movie> movieMap = new HashMap<>();

    public void rateMovie(String movieName, int rating) {
        if (!movieMap.containsKey(movieName)) {
            Movie newMovie = new Movie(movieName);
            movieMap.put(movieName, newMovie);
        }
        Movie movie = movieMap.get(movieName);
        movie.addRating(rating);
    }

    public void displayAverageRatingsDescending() {
        List<Movie> movies = new ArrayList<>(movieMap.values());


        movies.sort((m1, m2) -> Double.compare(m2.getAverageRating(), m1.getAverageRating()));

        System.out.println("Movies sorted by average rating (descending):");
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
