

//Problem 7: Movie Rating Aggregator (Map, List)
//        Users rate movies between 1-5.
//        •	Store movie name -> list of ratings.
//        •	Compute and display average rating per movie sorted descending.

package Pro_7_Movie_Rating;

public class Main {
    public static void main(String[] args) {
        MovieRatingAggregator aggregator = new MovieRatingAggregator();

        aggregator.rateMovie("Welcome", 5);
        aggregator.rateMovie("Welcome", 4);
        aggregator.rateMovie("Dhamaal", 3);
        aggregator.rateMovie("Dhamaal", 5);
        aggregator.rateMovie("Dhamaal", 4);
        aggregator.rateMovie("Avenger", 4);
        aggregator.rateMovie("Avenger", 5);
        aggregator.rateMovie("Avenger", 3);
        aggregator.rateMovie("Joker", 5);
        aggregator.rateMovie("Joker", 5);
        aggregator.rateMovie("Joker", 5);
        aggregator.rateMovie("3 Idiots", 4);
        aggregator.rateMovie("3 Idiots", 4);

        aggregator.displayAverageRatingsDescending();
    }
}
