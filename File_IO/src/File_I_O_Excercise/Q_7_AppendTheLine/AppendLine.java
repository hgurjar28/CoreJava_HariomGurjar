
//Write a program to append the line “Last updated on [current
//date]” to an existing file log.txt.
package File_I_O_Excercise.Q_7_AppendTheLine;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class AppendLine {
    public static void main(String[] args) {
        String fileName = "src/File_I_O_Excercise/Q_7_AppendTheLine/log.txt";
        String currentDate = LocalDate.now().toString();
        String lineToAppend = "Last updated on " + currentDate;

        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(lineToAppend + System.lineSeparator());
            System.out.println("Update successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}

