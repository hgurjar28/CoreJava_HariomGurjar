
//Write a program that checks if a file named report.pdf exists in
//the current directory and prints its size (in bytes).
package File_I_O_Excercise.Q_3_FileNameExists;

import java.io.File;

public class FileExists {
    public static void main(String[] args) {

        File file = new File("src/File_I_O_Excercise/Q_3_FileNameExists/input.txt");

        if (file.exists()) {
            System.out.println("File exists:"+file);
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File does not exist:"+file);
        }
    }
}
