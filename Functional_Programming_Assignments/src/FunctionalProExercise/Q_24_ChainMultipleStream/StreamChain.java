
//Chain multiple stream operations: filter > map > sort > collect.
package FunctionalProExercise.Q_24_ChainMultipleStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamChain {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "banana", "dog");


        List<String> result = words.stream()
                .filter(word -> word.length() > 3)
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Processed list: " + result);

    }
}
