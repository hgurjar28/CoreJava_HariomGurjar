
//Find the longest string in a list using reduce().
package FunctionalProExercise.Q_12_LongestString;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LongestStringReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "orange", "mango", "kiwi");

        Optional<String> longest = words.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        longest.ifPresent(str -> System.out.println("Longest word: " + str));
    }
}

