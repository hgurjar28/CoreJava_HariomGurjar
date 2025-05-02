package Pro_2_UniqueWordCounter;

import java.util.*;

public class WordFrequency {

    private  Map<String, Integer> wordCount = new HashMap<>();
    private  TreeSet<String> sortedWords = new TreeSet<>();

    public void analyze(List<String> words) {
        for (String word : words) {
            if (word.isEmpty()) continue;
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            sortedWords.add(word);
        }
    }

    public int getUniqueWordCount() {
        return sortedWords.size();
    }

    public void displayFrequencies() {
        System.out.println("\nWord Frequencies (Alphabetical Order):");
        for (String word : sortedWords) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    }
}
