
//Sort a list of integers in descending order using streams.
package FunctionalProExercise.Q_13_DescendingUseStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortDescending {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(4, 2, 9, 1, 5,3,10,8,6,12);

        List<Integer> sorted = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println(" Descending Order: " + sorted);
    }
}

