
//Implement a text analyzer: given a paragraph, split into words, count frequency of each word, and return a map.
package FunctionalProExercise.Q_51_TextAnalyzer;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class TextAnalyzer {
    public static void main(String[] args) {
        String paragraph = "Java is fun. Java is powerful. Streams in Java are powerful tools.";

        String[] words = paragraph
                .toLowerCase()
                .replaceAll("[^a-z ]", "")
                .split("\\s+");

        Map<String, Long> wordFreq = Arrays.stream(words)
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        wordFreq.forEach((word, count) -> System.out.println(word + " -> " + count));
    }
}

