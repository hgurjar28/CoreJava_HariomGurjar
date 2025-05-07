
//Group a list of names by their first letter using Collectors.groupingBy().
package FunctionalProExercise.Q_16_CollectorGrouping;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Vinit", "Aman", "Sonu", "Amit", "Sohal","Anil");

        Map<Character, List<String>> grouped = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println("Grouped by first letter: " + grouped);
    }
}
