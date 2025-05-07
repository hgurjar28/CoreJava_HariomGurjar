
//Find the product of all even numbers in a list using reduce().
package FunctionalProExercise.Q_28_ProductEvenNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ProductOfEvens {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6);

        Optional<Integer> product = numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce((a, b) -> a * b);

        product.ifPresent(p -> System.out.println("Product of evens: " + p));

    }
}
