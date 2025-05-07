
//Given a list of names, return a list of names longer than 4 characters.
package FunctionalProExercise.Q_10_ListOfName;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterLongNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arjun", "Aman", "Anurag", "Arya", "Parth");

        List<String> longNames = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());

        System.out.println("Names longer than 4 characters: " + longNames);
    }
}

