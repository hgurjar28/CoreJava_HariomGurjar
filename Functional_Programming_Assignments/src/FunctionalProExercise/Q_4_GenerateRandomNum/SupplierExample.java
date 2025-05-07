
//Write a Supplier<Double> that generates a random number
package FunctionalProExercise.Q_4_GenerateRandomNum;
import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {

        Supplier<Double> randomSupplier = () -> Math.random();

        System.out.println(randomSupplier.get());
        System.out.println(randomSupplier.get());

    }

}
