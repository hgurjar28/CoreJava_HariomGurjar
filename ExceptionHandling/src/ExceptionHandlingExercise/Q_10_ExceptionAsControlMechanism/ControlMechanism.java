
//Write a program that (incorrectly) uses exceptions to break out of normal loops
//        (e.g., using a try-catch inside a loop instead of a proper break condition).
//Then refactor it to avoid misuse.

package ExceptionHandlingExercise.Q_10_ExceptionAsControlMechanism;

public class ControlMechanism {

    public static void main(String[] args) {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Processing number: " + i);
                if (i == 5) {
                    throw new Exception("Breaking out of loop at i = " + i);
                }
            }
        } catch (Exception e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
