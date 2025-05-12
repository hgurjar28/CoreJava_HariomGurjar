
//Write a program to list all files and directories in a folder called
//documents.
package File_I_O_Excercise.Q_10_ListAllFiles;
import java.io.File;

public class ListFile {
    public static void main(String[] args) {
        File folder = new File("/Users/hgurjar/Documents");

        if (folder.exists() && folder.isDirectory()) {
            File[] items = folder.listFiles();

            if (items != null && items.length > 0) {
                System.out.println("Files in 'Documents':");
                for (File item : items) {
                    if (item.isFile()) {
                        System.out.println("File: " + item.getName());
                    } else if (item.isDirectory()) {
                        System.out.println("Directory: " + item.getName());
                    }
                }
            } else {
                System.out.println("'Documents' folder is empty.");
            }
        } else {
            System.out.println("'Documents' folder does not exist or is not a directory.");
        }
    }
}
