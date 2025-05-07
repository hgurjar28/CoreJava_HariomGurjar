
//Convert a list of strings to uppercase using map().
package FunctionalProExercise.Q_9_StringToUppercaseMap;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UppercaseMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("cat", "dog", "cow","parrot");

        List<String> uppercase = words.stream()

                .map(word -> word.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Uppercased words: " + uppercase);
    }
}
