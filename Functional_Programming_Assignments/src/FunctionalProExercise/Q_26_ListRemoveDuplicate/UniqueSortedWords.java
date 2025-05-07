
//From a list of words, remove duplicates and return sorted result.
package FunctionalProExercise.Q_26_ListRemoveDuplicate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueSortedWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "pear");


        List<String> result = words.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Unique sorted words: " + result);
    }
}
