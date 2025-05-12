
//Write a program that copies the contents of source.txt to a new
//file called backup.txt.
package File_I_O_Excercise.Q_5_CopyContaint;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContaint {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("src/File_I_O_Excercise/Q_5_CopyContaint/source.txt");
            FileWriter writer = new FileWriter("src/File_I_O_Excercise/Q_5_CopyContaint/backup.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            reader.close();
            writer.close();

            System.out.println("Contents copied successfully from source.txt to backup.txt.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copying.");
            e.printStackTrace();
        }
    }
}
