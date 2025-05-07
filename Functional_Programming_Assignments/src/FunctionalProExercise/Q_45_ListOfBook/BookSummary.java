
//Given a list of books, generate a summary object with total count, average rating, and total price.
package FunctionalProExercise.Q_45_ListOfBook;
import java.util.Arrays;
import java.util.List;

public class BookSummary {
    public static void main(String[] args) {

        class Book {
            String title;
            double rating;
            int price;

            public Book(String title, double rating, int price) {
                this.title = title;
                this.rating = rating;
                this.price = price;
            }
        }

        List<Book> books = Arrays.asList(
                new Book("Java ", 4.5, 499),
                new Book("Python ", 4.2, 399),
                new Book("C++", 3.9, 299)
        );

        long totalCount = books.size();

        double averageRating = books.stream()
                .mapToDouble(book -> book.rating)
                .average()
                .orElse(0.0);

        double totalPrice = books.stream()
                .mapToDouble(book -> book.price)
                .sum();

        System.out.println("Total Books: " + totalCount);
        System.out.println("Average Rating: " + averageRating);
        System.out.println("Total Price :" + totalPrice);
    }
}
