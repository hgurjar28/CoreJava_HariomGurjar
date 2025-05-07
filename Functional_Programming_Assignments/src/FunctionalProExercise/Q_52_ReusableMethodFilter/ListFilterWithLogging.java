
//Create a reusable method that filters a list based on a passed-in Predicate<T> and logs each filtered item.
package FunctionalProExercise.Q_52_ReusableMethodFilter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListFilterWithLogging {
    public static <T> List<T> filterAndLog(List<T> list, Predicate<T> predicate) {
        return list.stream()
                .filter(item -> {
                    boolean result = predicate.test(item);
                    if (result) {
                        System.out.println("Accepted: " + item);
                    }
                    return result;
                })
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Jitendra", "Mukesh", "Harshit", "Ganesh");

        List<String> result = filterAndLog(names, name -> name.length() > 6);

        System.out.println("Filtered List: " + result);
    }
}

