
//Define a custom checked exception (FileValidationException) and a
//runtime exception (CriticalSystemException).
//Write code that shows where and why each type makes sense.

package ExceptionHandlingExercise.Q_6_CustomCheckedUnchecked;


class FileValidationException extends Exception {
    public FileValidationException(String message) {
        super(message);
    }
}

class CriticalSystemException extends RuntimeException {
    public CriticalSystemException(String message) {
        super(message);
    }
}

public class CheckedUnchecked {

    public static void validateFile(String filePath) throws FileValidationException {
        if (filePath == null || filePath.isEmpty()) {
            throw new FileValidationException("File path is invalid or empty.");
        }
        if (!filePath.endsWith(".txt")) {
            throw new FileValidationException("File must be a .txt file.");
        }
        System.out.println("File validation successful.");
    }

    public static void performCriticalOperation() {

        throw new CriticalSystemException("System encountered a critical failure. Immediate attention required.");
    }

    public static void main(String[] args) {

        try {
            validateFile("");
        } catch (FileValidationException e) {
            System.out.println("File validation failed: " + e.getMessage());
        }

        try {
            performCriticalOperation();
        } catch (CriticalSystemException e) {
            System.out.println("Critical system failure: " + e.getMessage());
        }
    }
}
