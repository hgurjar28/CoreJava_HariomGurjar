//
//Write a program with three methods: readData(), processData(), and
//        main().
//         readData() reads from a file and throws IOException.
//         processData() calls readData() and catches IOException,
//        then throws a DataProcessingException (custom).
//         main() catches DataProcessingException and logs it.
//        Simulate this flow and explain how exceptions travel across layers.

package ExceptionHandlingExercise.Q_1_Multi_Level;
import java.io.*;

class DataProcessingException extends Exception {
    public DataProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionFlow {

    public static void readData() throws IOException {
        throw new IOException("File not found while reading data.");
    }

    public static void processData() throws DataProcessingException {
        try {
            readData();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
            throw new DataProcessingException("Error processing data", e);
        }
    }

    public static void main(String[] args) {
        try {
            processData();
        } catch (DataProcessingException e) {
            System.out.println("Caught DataProcessingException: " + e.getMessage());
        }
    }
}
