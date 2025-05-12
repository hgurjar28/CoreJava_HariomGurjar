
//Write a Java application where all uncaught exceptions are logged by setting a
//global exception handler (using
//  Thread.setDefaultUncaughtExceptionHandler()).
package ExceptionHandlingExercise.Q_12_GlobalExceptionHandler;


class GlobalUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {

        System.out.println("Uncaught exception in thread: " + t.getName());
        System.out.println("Exception message: " + e.getMessage());
    }
}


class ChildThread extends Thread {
    @Override
    public void run() {
        System.out.println("Child thread is running...");

        throw new RuntimeException("Something went wrong in the child thread!");
    }
}

public class GlobalException {
    public static void main(String[] args) {

        Thread.setDefaultUncaughtExceptionHandler(new GlobalUncaughtExceptionHandler());


        ChildThread childThread = new ChildThread();
        childThread.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Thread 2 is running...");
            throw new RuntimeException("Error in thread 2!");
        });
        thread2.start();

        System.out.println("Main thread is running...");
        throw new RuntimeException("Error in the main thread!");
    }
}
