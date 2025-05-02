
//Problem 2: Unique Word Frequency Counter (Map, TreeSet)
//        Given a paragraph, calculate and print:
//        •	Number of unique words
//        •	Frequency of each word
//        •	Display words sorted alphabetically


package Pro_2_UniqueWordCounter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String paragraph = "Java is a high-level programming language. Java is also platform-independent. The Java Virtual Machine makes Java secure and portable. Java is widely used in web development";


        List<String> words = WordProcessor.extractWords(paragraph);


        WordFrequency analyzer = new WordFrequency();
        analyzer.analyze(words);

        System.out.println("Number of unique words: " + analyzer.getUniqueWordCount());
        analyzer.displayFrequencies();
    }
}
