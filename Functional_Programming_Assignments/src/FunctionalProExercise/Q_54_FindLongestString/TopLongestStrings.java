
//Create a program that returns the top 3 longest strings from a list, using streams.
package FunctionalProExercise.Q_54_FindLongestString;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TopLongestStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Rohan", "Pramod", "Simran", "Ravina", "Aayushi", "Ishita");

        List<String> Longest = words.stream()
                .sorted((a, b) -> Integer.compare(b.length(), a.length()))
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Top 3 Longest Strings: " + Longest);
    }
}

