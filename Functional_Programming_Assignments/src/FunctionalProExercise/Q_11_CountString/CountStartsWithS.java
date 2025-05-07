
//Count how many strings in a list start with “S”.
package FunctionalProExercise.Q_11_CountString;
import java.util.Arrays;
import java.util.List;

public class CountStartsWithS {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Shubam", "Aryan", "Samarth", "Vinit", "Sudeep", "Tarun");

        long count = names.stream()
                .filter(name -> name.startsWith("S"))
                .count();
        System.out.println("Names starting with 'S': " + count);
    }
}

