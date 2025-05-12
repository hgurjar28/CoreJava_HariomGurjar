
//Write a multithreaded program where a child thread throws a
//RuntimeException.
//Show how the main thread can detect and handle that exception using
//Thread.setUncaughtExceptionHandler().
package ExceptionHandlingExercise.Q_11_ThreadExceptionHandling;


class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
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

public class ThreadException {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

        ChildThread childThread = new ChildThread();
        childThread.start();

        System.out.println("Main thread is running...");
    }
}

