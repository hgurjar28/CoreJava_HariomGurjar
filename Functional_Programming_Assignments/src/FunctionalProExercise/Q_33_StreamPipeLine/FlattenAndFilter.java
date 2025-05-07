
//Create a stream pipeline to flatten a list of lists of integers and return the distinct even numbers.
package FunctionalProExercise.Q_33_StreamPipeLine;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenAndFilter {
    public static void main(String[] args) {
        List<List<Integer>> numList = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 2),
                Arrays.asList(6, 7,8)
        );

        List<Integer> result = numList.stream()
                .flatMap(List::stream)
                .filter(n -> n % 2 == 0)
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + result);
    }
}

