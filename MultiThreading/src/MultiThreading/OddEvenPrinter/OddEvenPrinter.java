package MultiThreading.OddEvenPrinter;

public class OddEvenPrinter {


    private int number = 1;


    private final int MAX = 100;


    private final Object lock = new Object();

    public void printOdd() {
        synchronized (lock) {
            while (number <= MAX) {

                if (number % 2 == 1) {
                    System.out.print(number + " ");
                    number++;


                    lock.notify();

                } else {

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            lock.notify();
        }
    }


    public void printEven() {
        synchronized (lock) {
            while (number <= MAX) {
                // Check if the number is even
                if (number % 2 == 0) {
                    System.out.print(number + " ");
                    number++;

                    lock.notify();

                } else {

                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            }

            lock.notify();
        }
    }


    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();


        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printOdd();
            }
        });


        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                printer.printEven();
            }
        });


        threadA.start();
        threadB.start();
    }
}
