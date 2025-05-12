
//Write a program that reads all .txt files in a folder and merges
//their contents into a single file named merged.txt
package File_I_O_Excercise.Q_12_ReadFileAndMerges;
import java.io.*;

public class ReadAndMerge {
    public static void main(String[] args) {
        File folder = new File("src/File_I_O_Excercise/Q_12_ReadFileAndMerges/Download");
        File mergedFile = new File("src/File_I_O_Excercise/Q_12_ReadFileAndMerges/merged.txt");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(mergedFile))) {
            File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

            if (files != null && files.length > 0) {
                for (File file : files) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            writer.write(line);
                            writer.newLine();
                        }
                    }
                    writer.newLine();
                }
                System.out.println("All .txt files have been merged into merged.txt");
            } else {
                System.out.println("No .txt files found in the 'Download' folder.");
            }
        } catch (IOException e) {
            System.err.println("Error merging files: " + e.getMessage());
        }
    }
}
