
//Implement compose() and andThen() examples using Function<T, R>.
package FunctionalProExercise.Q_44_ImplementCompose;
import java.util.function.Function;

public class ComposeAndThenExample {
    public static void main(String[] args) {

        Function<String, String> addExclamation = s -> s + "!";

        Function<String, String> toUpperCase = String::toUpperCase;

        Function<String, String> andThenExample = toUpperCase.andThen(addExclamation);

        Function<String, String> composeExample = toUpperCase.compose(addExclamation);

        System.out.println("andThen Result: " + andThenExample.apply("hello"));
        System.out.println("compose Result: " + composeExample.apply("hello"));
    }
}
