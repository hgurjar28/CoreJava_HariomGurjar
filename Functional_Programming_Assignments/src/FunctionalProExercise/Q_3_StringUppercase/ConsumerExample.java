
//Use a Consumer<String> to print a string in uppercase.
package FunctionalProExercise.Q_3_StringUppercase;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<String> printUppercase = str -> System.out.println(str.toUpperCase());


        printUppercase.accept("hello");
        printUppercase.accept("java");

    }
}

