
//Convert a list of integers to a Set using Collectors.toSet().
package FunctionalProExercise.Q_21_ConvertListBySet;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertToSet {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);

        Set<Integer> numberSet = numbers.stream().collect(Collectors.toSet());

        System.out.println("Set of numbers: " + numberSet);
    }
}
