//Create a Runnable lambda that prints “Hello Functional Java”.
package FunctionalProExercise.Q_7_RunableLambdaPrint;

public class RunnableExample {
    public static void main(String[] args) {

        Runnable sayHello = () -> System.out.println("Hello Functional Java");

        sayHello.run();
    }
}
