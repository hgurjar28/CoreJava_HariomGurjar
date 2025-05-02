package Pro_7_Movie_Rating;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    private String name;
    private List<Integer> ratings = new ArrayList<>();

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRating(int rating) {
        if (rating >= 1 && rating <= 5) {
            ratings.add(rating);
        } else {
            System.out.println("Rating must be between 1 and 5.");        }
    }

    public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;
        int sum = 0;
        for (int r : ratings) {
            sum += r;
        }
        return (double) sum / ratings.size();
    }


    @Override
    public String toString() {
        return name + " - Average Rating: " + getAverageRating();

    }
}
