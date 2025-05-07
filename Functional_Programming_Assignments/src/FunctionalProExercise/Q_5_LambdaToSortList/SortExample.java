//Use a lambda expression to sort a list of strings alphabetically.
package FunctionalProExercise.Q_5_LambdaToSortList;

import java.util.Arrays;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Banana", "Apple", "Cherry","Kiwi","Orange","Mango");

        words.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(words);
    }
}
