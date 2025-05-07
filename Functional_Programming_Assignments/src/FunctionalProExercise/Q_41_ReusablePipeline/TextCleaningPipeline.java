
//Build a reusable pipeline of 3 functions: trim, lowercase, and remove punctuation from strings.
package FunctionalProExercise.Q_41_ReusablePipeline;
import java.util.function.Function;

public class TextCleaningPipeline {
    public static void main(String[] args) {
        Function<String, String> trim = String::trim;

        Function<String, String> toLower = String::toLowerCase;

        Function<String, String> removePunct = s -> s.replaceAll("\\p{Punct}", "");

        Function<String, String> cleanPipeline = trim.andThen(toLower).andThen(removePunct);

        String input = "  Hello, Java!! ";
        String cleaned = cleanPipeline.apply(input);

        System.out.println("Cleaned Text: " + cleaned);
    }
}
