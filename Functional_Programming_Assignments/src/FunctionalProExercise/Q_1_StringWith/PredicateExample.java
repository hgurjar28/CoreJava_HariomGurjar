
//Write a Predicate<String> that returns true if a string starts with “A”.

package FunctionalProExercise.Q_1_StringWith;

import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {

        Predicate<String> startsWithA = str -> str.startsWith("A");


        System.out.println(startsWithA.test("Apple"));
        System.out.println(startsWithA.test("Banana"));
    }
}
