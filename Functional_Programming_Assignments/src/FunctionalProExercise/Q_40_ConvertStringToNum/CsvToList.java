
//Convert a CSV string of numbers ("1,2,3,4") into a List<Integer> using streams and lambdas
package FunctionalProExercise.Q_40_ConvertStringToNum;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CsvToList {
    public static void main(String[] args) {
        String csv = "1,2,3,4";

        List<Integer> numbers = Arrays.stream(csv.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(" Numbers: " + numbers);
    }
}
