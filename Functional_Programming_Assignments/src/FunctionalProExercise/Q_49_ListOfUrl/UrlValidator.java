
//Given a list of URLs (strings), use streams to validate them using a Predicate<String> and return only valid ones.
package FunctionalProExercise.Q_49_ListOfUrl;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UrlValidator {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "https://Vena.com",
                "http://Facebook.com",
                "ftp://Instagram.com",
                "Microsoft.com"
        );

        Predicate<String> isValidUrl = url -> url.startsWith("http://") || url.startsWith("https://");

        List<String> validUrls = urls.stream()
                .filter(isValidUrl)
                .collect(Collectors.toList());

        System.out.println("Valid URLs:");
        validUrls.forEach(System.out::println);
    }
}

