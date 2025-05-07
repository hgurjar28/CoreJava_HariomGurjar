
//From a list of words, create a list of their lengths.
package FunctionalProExercise.Q_15_ListOfWordToLenght;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordLengths {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Mango", "Orange","Kiwi");


        List<Integer> lengths = words.stream()

                .map(word -> word.length())
                .collect(Collectors.toList());

        System.out.println("Word lengths: " + lengths);
    }
}
