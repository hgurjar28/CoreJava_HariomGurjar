package ExceptionHandlingHandsOn;
import java.io.*;
import java.util.*;

class InvalidGradeException extends Exception {
    public InvalidGradeException(String message) {
        super(message);
    }
}

public class StudentGradeProcessor {

    public static void main(String[] args) {
        String filePath = "/Users/hgurjar/Documents/grade.txt";
        List<String> validEntries = new ArrayList<>();
        List<String> failingStudents = new ArrayList<>();

        double totalGrades = 0.0;
        int validCount = 0;

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(" ");
                if (parts.length != 2) {
                    System.out.println("Skipping invalid format: " + line);
                    continue;
                }

                String name = parts[0];
                String gradeStr = parts[1];

                try {
                    double grade = Double.parseDouble(gradeStr);

                    if (grade < 0.0 || grade > 100.0) {
                        throw new InvalidGradeException("Grade out of range for " + name + ": " + grade);
                    }

                    validEntries.add(name + " => " + grade);
                    totalGrades += grade;
                    validCount++;

                    if (grade < 40.0) {
                        failingStudents.add(name);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Warning: Non-numeric grade for " + name + " => " + gradeStr);
                } catch (InvalidGradeException e) {
                    System.out.println("Warning: " + e.getMessage());
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            try {
                if (reader != null) reader.close();
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
        
        System.out.println("\n--- Valid Student Grades ---");
        for (String entry : validEntries) {
            System.out.println(entry);
        }


        System.out.println("\n--- Students Fails (<33) ---");
        if (failingStudents.isEmpty()) {
            System.out.println("None");
        } else {
            for (String name : failingStudents) {
                System.out.println(name);
            }
        }

        System.out.println("\n--- Average Grade ---");
        if (validCount > 0) {
            double average = totalGrades / validCount;
            System.out.printf("Average: %.2f\n", average);
        } else {
            System.out.println("No valid grades to calculate average.");
        }
    }
}
