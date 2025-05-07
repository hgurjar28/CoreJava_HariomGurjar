
//Compose two functions: one that converts string to uppercase and one that appends “!”.
package FunctionalProExercise.Q_23_ComposeTwoFunction;
import java.util.function.Function;

public class FunctionComposition {
    public static void main(String[] args) {

        Function<String, String> toUpper = str -> str.toUpperCase();


        Function<String, String> addExclamation = str -> str + "!";


        Function<String, String> excitedUppercase = toUpper.andThen(addExclamation);

        String result = excitedUppercase.apply("hello");
        System.out.println("Composed result: " + result);
    }
}
