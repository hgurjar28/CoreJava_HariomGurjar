package Pro_2_UniqueWordCounter;

import java.util.Arrays;
import java.util.List;

public class WordProcessor {



    public static List<String> extractWords(String paragraph) {

        String cleaned = paragraph.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = cleaned.split("\\s+");

        return Arrays.asList(words);
    }
}
