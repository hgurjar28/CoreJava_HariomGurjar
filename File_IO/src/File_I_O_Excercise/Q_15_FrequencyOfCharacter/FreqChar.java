
//Write a program that reads a text file and counts the frequency of
//each character (including spa ces and punctuation). Print the result to a
//file named charcount.txt.
package File_I_O_Excercise.Q_15_FrequencyOfCharacter;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class FreqChar {
    public static void main(String[] args) {
        Path inputFile = Paths.get("src/File_I_O_Excercise/Q_15_FrequencyOfCharacter/input.txt");
        Path outputFile = Paths.get("src/File_I_O_Excercise/Q_15_FrequencyOfCharacter/charcount.txt");

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        try {
            String content = new String(Files.readAllBytes(inputFile), "UTF-8");


            for (char c : content.toCharArray()) {
                charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
            }

            StringBuilder result = new StringBuilder();
            for (Map.Entry<Character, Integer> entry : charFrequencyMap.entrySet()) {
                result.append(entry.getKey())
                        .append(": ")
                        .append(entry.getValue())
                        .append(System.lineSeparator());
            }

            Files.write(outputFile, result.toString().getBytes(), StandardOpenOption.CREATE, StandardOpenOption.WRITE);

            System.out.println("Character frequency has been written to charcount.txt.");

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
