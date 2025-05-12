
//Write a program that opens two files (BufferedReader and
//        BufferedWriter), reads from one, and writes to the other.
//        Use try-with-resources to ensure both are closed safely, even if
//        exceptions occur in the middle.

package ExceptionHandlingExercise.Q_3_Exception_Safe;
import java.io.*;

public class SafeException {

    public static void main(String[] args) {

        String inputFile = "/Users/hgurjar/Documents/input.txt";
        String outputFile = "/Users/hgurjar/Documents/output.txt";


        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file operation: " + e.getMessage());
        }
    }
}
