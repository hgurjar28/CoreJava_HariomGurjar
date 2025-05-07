
//Write a generic method that accepts a List<T> and a Function<T, R> and applies the function to all elements.
package FunctionalProExercise.Q_43_GenericMethod;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GenericFunctionMapper {

    public static <T, R> List<R> mapList(List<T> input, Function<T, R> mapper) {
        return input.stream()
                .map(mapper)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Amit", "Nitin", "Karan");

        List<Integer> lengths = mapList(names, String::length);

        System.out.println("Name Lengths: " + lengths);
    }
}
