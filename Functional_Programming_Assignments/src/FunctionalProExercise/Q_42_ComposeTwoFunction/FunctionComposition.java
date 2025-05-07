
//Compose two functions: one for string parsing (String -> Integer) and one for doubling the number (Integer -> Integer).
package FunctionalProExercise.Q_42_ComposeTwoFunction;
import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {

        Function<String, Integer> parse = Integer::parseInt;
        Function<Integer, Integer> doubleIt = x -> x * 2;

        Function<String, Integer> parseAndDouble = parse.andThen(doubleIt);

        System.out.println("Result: " + parseAndDouble.apply("16"));
    }
}

