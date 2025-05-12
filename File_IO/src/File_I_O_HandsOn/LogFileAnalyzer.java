package File_I_O_HandsOn;

import java.io.*;
import java.nio.file.*;

public class LogFileAnalyzer {

    public static void main(String[] args) {

        String inputFileName = args.length > 0 ? args[0] : "src/File_I_O_HandsOn/server.log";
        String outputFileName = args.length > 1 ? args[1] : "src/File_I_O_HandsOn/summary.txt";

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(Paths.get(inputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                totalLines++;

                if (line.toLowerCase().contains("error")) {
                    errorCount++;
                }
                if (line.toLowerCase().contains("warning")) {
                    warningCount++;
                }
            }

        } catch (NoSuchFileException e) {
            System.err.println("Error: The file '" + inputFileName + "' was not found.");
            return;
        } catch (IOException e) {
            System.err.println("I/O Error while reading the file: " + e.getMessage());
            return;
        }

        double errorPercent = totalLines > 0 ? (errorCount * 100.0) / totalLines : 0.0;
        double warningPercent = totalLines > 0 ? (warningCount * 100.0) / totalLines : 0.0;

        StringBuilder report = new StringBuilder();
        report.append("Log Summary Report\n");
        report.append("------------------\n");
        report.append("Total log entries: ").append(totalLines).append("\n");
        report.append("ERROR entries: ").append(errorCount)
                .append(" (").append(String.format("%.2f", errorPercent)).append("%)\n");
        report.append("WARNING entries: ").append(warningCount)
                .append(" (").append(String.format("%.2f", warningPercent)).append("%)\n");

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputFileName))) {
            writer.write(report.toString());
            System.out.println("Summary report written to " + outputFileName);
        } catch (IOException e) {
            System.err.println("I/O Error while writing the summary: " + e.getMessage());
        }
    }
}

