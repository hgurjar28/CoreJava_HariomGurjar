
//Write a program to count the number of lines in a text file called
//data.txt.
package File_I_O_Excercise.Q_4_CountNumberOfLine;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        int lineCount = 0;

        try {
            File file = new File("src/File_I_O_Excercise/Q_4_CountNumberOfLine/grade.txt");

            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                reader.nextLine();
                lineCount++;
            }

            reader.close();

            System.out.println("Number of lines in data.txt: " + lineCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: data.txt");
            e.printStackTrace();
        }
    }
}
