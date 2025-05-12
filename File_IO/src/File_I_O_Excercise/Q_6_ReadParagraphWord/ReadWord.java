
//Write a program to read all the words from paragraph.txt and
//count how many times the word "Java" appears.
package File_I_O_Excercise.Q_6_ReadParagraphWord;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadWord {
    public static void main(String[] args) {
        String fileName = "src/File_I_O_Excercise/Q_6_ReadParagraphWord/paragraph.txt";
        int javaCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] words = line.split("[\\s.,!?;:\"()\\[\\]{}]+");

                for (String word : words) {
                    if (word.equalsIgnoreCase("Java")) {
                        javaCount++;
                    }
                }
            }

            System.out.println("The word \"Java\" appears " + javaCount + " times.");
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
