
//Compute the average length of strings in a list.
package FunctionalProExercise.Q_27_AvgLengthOfString;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class AverageStringLength {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hi", "hello", "world");


        OptionalDouble average = words.stream()
                .mapToInt(String::length)
                .average();

        average.ifPresent(avg -> System.out.println("Average length: " + avg));
    }
}

