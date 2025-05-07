package MultiThreading.BasicLogging;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.*;

public class Login {
    private final BlockingQueue<String> logQueue = new LinkedBlockingQueue<>();
    private final ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
    private final boolean logToFile;
    private final File logFile;
    private volatile boolean isRunning = true;

    public Login(boolean logToFile) {
        this.logToFile = logToFile;
        this.logFile = logToFile ? new File("logs.txt") : null;


        scheduler.scheduleAtFixedRate(this::flushLogs, 5, 5, TimeUnit.SECONDS);
    }


    public void log(String level, String message) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        String formatted = "[" + timestamp + "] [" + level.toUpperCase() + "] " + message;
        logQueue.offer(formatted);
    }


    public void info(String msg)  { log("INFO", msg); }
    public void warn(String msg)  { log("WARN", msg); }
    public void error(String msg) { log("ERROR", msg); }


    private void flushLogs() {
        try {
            PrintWriter writer = logToFile ? new PrintWriter(new FileWriter(logFile, true)) : null;

            String entry;
            while ((entry = logQueue.poll()) != null) {
                if (logToFile) {
                    writer.println(entry);
                } else {
                    System.out.println(entry);
                }
            }

            if (writer != null) {
                writer.flush();
                writer.close();
            }

        } catch (IOException e) {
            System.err.println("Error writing logs: " + e.getMessage());
        }
    }


    public void shutdown() {
        isRunning = false;
        scheduler.shutdown();
        try {
            if (!scheduler.awaitTermination(6, TimeUnit.SECONDS)) {
                scheduler.shutdownNow();
            }
        } catch (InterruptedException e) {
            scheduler.shutdownNow();
        }
        flushLogs();
    }


    public static void main(String[] args) throws InterruptedException {
        Login logger = new Login(false);
        int threadCount = 100;
        int messagesPerThread = 100;
        ExecutorService executor = Executors.newFixedThreadPool(threadCount);

        for (int i = 0; i < threadCount; i++) {
            int threadId = i;
            executor.submit(() -> {
                for (int j = 0; j < messagesPerThread; j++) {
                    logger.info("Thread " + threadId + " - Message " + j);
                }
            });
        }

        executor.shutdown();
        executor.awaitTermination(30, TimeUnit.SECONDS);


        logger.shutdown();
        System.out.println("All logs flushed and logger shutdown.");
    }
}
