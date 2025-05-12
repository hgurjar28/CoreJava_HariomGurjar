
//Write a program to read a binary file (e.g., image.jpg) and copy
//its contents to image_copy.jpg.
package File_I_O_Excercise.Q_11_ReadBinaryFile;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadBinnary {
    public static void main(String[] args) {
        String sourceFile = "src/File_I_O_Excercise/Q_11_ReadBinaryFile/images.jpeg";
        String destinationFile = "src/File_I_O_Excercise/Q_11_ReadBinaryFile/image_copy.jpg";

        try (FileInputStream input = new FileInputStream(sourceFile);
             FileOutputStream output = new FileOutputStream(destinationFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buffer)) != -1) {
                output.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.err.println("Error during file copy: " + e.getMessage());
        }
    }
}

