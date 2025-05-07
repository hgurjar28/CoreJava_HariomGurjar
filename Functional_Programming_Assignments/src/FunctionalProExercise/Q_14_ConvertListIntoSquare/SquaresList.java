
//Convert a list of integers into a list of their squares.
package FunctionalProExercise.Q_14_ConvertListIntoSquare;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquaresList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

                System.out.println("Squared numbers: " + squares);
    }
}
