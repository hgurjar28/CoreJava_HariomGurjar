
//Join a list of strings into a single comma-separated string.
package FunctionalProExercise.Q_18_JoinListByComma;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Mango", "Orange");

        String result = words.stream()
                .collect(Collectors.joining(","));
        System.out.println("Joined string: " + result);
    }
}

