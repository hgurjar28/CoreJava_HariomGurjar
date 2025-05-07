package MultiThreading.ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ImageProcessor {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        int numberOfImages = 50;
        int threadPoolSize = 5;


        ExecutorService executor = Executors.newFixedThreadPool(threadPoolSize);


        List<Future<String>> futures = new ArrayList<>();


        long startTime = System.currentTimeMillis();


        for (int i = 1; i <= numberOfImages; i++) {
            final int imageId = i;


            Callable<String> task = () -> {
                Thread.sleep(100);
                return "Image " + imageId + " processed";
            };

            futures.add(executor.submit(task));
        }

        for (Future<String> future : futures) {
            System.out.println(future.get());
        }


        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + " ms");


        executor.shutdown();
    }
}
