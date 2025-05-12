
//Write a try-with-resources block where two custom resources both
//throw exceptions in close().
//Capture and display the suppressed exceptions from the primary one.

package ExceptionHandlingExercise.Q_7_HandlingSuppressed;

class Resource1 implements AutoCloseable {
    public void doSomething() {
        System.out.println("Resource1 is doing something.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing Resource1...");
        throw new Exception("Exception thrown by Resource1 during close.");
    }
}


class Resource2 implements AutoCloseable {
    public void doSomethingElse() {
        System.out.println("Resource2 is doing something else.");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing Resource2...");
        throw new Exception("Exception thrown by Resource2 during close.");
    }
}

public class HandlingSuppressed {

    public static void main(String[] args) {

        try (Resource1 resource1 = new Resource1(); Resource2 resource2 = new Resource2()) {
            resource1.doSomething();
            resource2.doSomethingElse();
        } catch (Exception e) {

            System.out.println("Caught exception: " + e.getMessage());

            Throwable[] suppressed = e.getSuppressed();
            if (suppressed.length > 0) {
                System.out.println("Suppressed exceptions:");
                for (Throwable t : suppressed) {
                    System.out.println(t.getMessage());
                }
            }
        }
    }
}
