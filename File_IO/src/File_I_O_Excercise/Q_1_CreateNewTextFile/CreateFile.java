
//Write a program to create a new text file named notes.txt and write the line:
//        “This is my first file in Java.”
package File_I_O_Excercise.Q_1_CreateNewTextFile;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("src/File_I_O_Excercise/Q_1_CreateNewTextFile/notes.txt");

            writer.write("This is my first file in Java.");

            writer.close();

            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
