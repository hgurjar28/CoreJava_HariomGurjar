
//Write a function that takes a list of strings and returns a map of word to its length.
package FunctionalProExercise.Q_22_WordLenghtByMap;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordLengthMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear");

        Map<String, Integer> wordLengthMap = words.stream()
                .collect(Collectors.toMap(
                        word -> word,
                        word -> word.length()
                ));

        System.out.println("Word to length map: " + wordLengthMap);
    }
}
