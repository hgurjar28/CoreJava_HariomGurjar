
//Create a Function<String, Integer> that returns the length of a string.
package FunctionalProExercise.Q_2_StringLength;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, Integer> stringLength = str -> str.length();


        System.out.println(stringLength.apply("Hello"));
        System.out.println(stringLength.apply("Java"));
    }
}
