//Create a BiFunction<Integer, Integer, Integer> that returns the sum.
package FunctionalProExercise.Q_6_BitFunctionForSum;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;

        System.out.println("Sum :"+add.apply(50, 7));
        System.out.println("Sum :"+add.apply(16, 15));
    }
}

