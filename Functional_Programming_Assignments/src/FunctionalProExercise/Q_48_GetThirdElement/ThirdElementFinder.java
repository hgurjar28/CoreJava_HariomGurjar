
//Safely get the third element of a list using stream().skip(2).findFirst() and return Optional<T>.
package FunctionalProExercise.Q_48_GetThirdElement;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ThirdElementFinder {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Kiwi", "Orange", "Mango");

        Optional<String> third = words.stream()
                .skip(2)
                .findFirst();

        third.ifPresentOrElse(
                value -> System.out.println("Third element: " + value),
                () -> System.out.println("Third element not found")
        );
    }
}
