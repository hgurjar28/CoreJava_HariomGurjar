package ExceptionHandlingExercise.Q_4_ReThrowing;

class CustomException extends Exception {
    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ReThrowing {

    public static void main(String[] args) {
        try {
            methodThatThrowsException();
        } catch (Exception e) {
            // Handle exception here instead of re-throwing it
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();  // Print the original stack trace
        }
    }

    public static void methodThatThrowsException() throws Exception {
        throw new Exception("Original exception message");
    }
}
