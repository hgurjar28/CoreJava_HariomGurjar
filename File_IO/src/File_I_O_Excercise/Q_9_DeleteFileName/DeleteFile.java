
//Write a program to delete a file named oldfile.txt if it exists.
package File_I_O_Excercise.Q_9_DeleteFileName;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File file = new File("src/File_I_O_Excercise/Q_9_DeleteFileName/oldfile.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
