
//Write a program that uses NIO (Files class) to read and write
//data between files with proper exception handling.
package File_I_O_Excercise.Q_14_UsesNio;
import java.io.IOException;
import java.nio.file.*;

public class UsesNio {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("src/File_I_O_Excercise/Q_14_UsesNio/source.txt");
        Path destinationFile = Paths.get("src/File_I_O_Excercise/Q_14_UsesNio/destination.txt");

        try {
            if (Files.exists(sourceFile)) {
                byte[] fileData = Files.readAllBytes(sourceFile);
                Files.write(destinationFile, fileData, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
                System.out.println("File copied successfully!");
            } else {
                System.err.println("Source file does not exist.");
            }
        } catch (IOException e) {
            System.err.println("An error occurred while processing the file: " + e.getMessage());
        }
    }
}
