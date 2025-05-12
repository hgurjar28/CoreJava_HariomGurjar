
//Write a program to read and print the contents of a file named
//        input.txt.
package File_I_O_Excercise.Q_2_ReadAndPrintFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile{
    public static void main(String[] args) {
        try {

            File file = new File("src/File_I_O_Excercise/Q_2_ReadAndPrintFile/input.txt");

            Scanner reader = new Scanner(file);

            System.out.println("Contents of input.txt:");

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: input.txt");
            e.printStackTrace();
        }
    }
}

