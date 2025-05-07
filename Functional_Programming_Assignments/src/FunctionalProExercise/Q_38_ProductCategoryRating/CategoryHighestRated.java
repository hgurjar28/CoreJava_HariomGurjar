
//Given a list of products with category and rating, return a map of category → highest-rated product name.
package FunctionalProExercise.Q_38_ProductCategoryRating;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CategoryHighestRated {
    
    static class Product {
        String name;
        String category;
        double rating;

        Product(String name, String category, double rating) {
            this.name = name;
            this.category = category;
            this.rating = rating;
        }
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Phone", "Electronics", 4.5),
                new Product("Laptop", "Electronics", 4.8),
                new Product("Banana", "Grocery", 4.2),
                new Product("Apple", "Grocery", 4.6)
        );
        Map<String, String> topRatedByCategory = products.stream()
                .collect(Collectors.groupingBy(
                        product -> product.category,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(p -> p.rating)),
                                optionalProduct -> optionalProduct.map(p -> p.name).orElse("")
                        )
                ));

        System.out.println("Top Rated Products by Category: " + topRatedByCategory);

    }
}
