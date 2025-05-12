
//Write a program that monitors a log file (server.log) and
//prints only the lines that contain the word "ERROR".
package File_I_O_Excercise.Q_13_MonitorsLogFile;
import java.io.*;

public class LogFile {
    public static void main(String[] args) {
         File logFile = new File("src/File_I_O_Excercise/Q_13_MonitorsLogFile/server.log");

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;

            while (true) {
                if ((line = reader.readLine()) != null) {
                    if (line.contains("ERROR")) {
                        System.out.println(line);
                    }
                } else {

                    Thread.sleep(1000);
                }
            }
        } catch (IOException | InterruptedException e) {
            System.err.println("Error monitoring log file: " + e.getMessage());
        }
    }
}
