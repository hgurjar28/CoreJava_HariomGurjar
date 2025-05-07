
//Find the first element in a list of integers that is divisible by 5 using findFirst().
package FunctionalProExercise.Q_19_FindElementInList;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstDivisibleBy5 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 7, 10, 13, 20);

                Optional<Integer> firstDiv = numbers.stream()
                .filter(n -> n % 5 == 0)
                .findFirst();

        firstDiv.ifPresent(n -> System.out.println("First divisible by 5: " + n));  // Output: 10
    }
}

