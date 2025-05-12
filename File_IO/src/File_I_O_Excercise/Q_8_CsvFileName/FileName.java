
//Write a program that reads a CSV file named employees.csv
//and prints each line in uppercase.
package File_I_O_Excercise.Q_8_CsvFileName;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileName {
    public static void main(String[] args) {
        String fileName = "src/File_I_O_Excercise/Q_8_CsvFileName/employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
