
//Create your own functional interface called TriFunction<T, U, V, R> (takes 3 args).
package FunctionalProExercise.Q_29_TriFuctionInterface;

public class TriFunctionExample {

    @FunctionalInterface
    interface TriFunction<num1, num2, num3, result> {
        result apply(num1 n1, num2 n2, num3 n3);
    }

    public static void main(String[] args) {

        TriFunction<Integer, Integer, Integer, Integer> sum = (a, b, c) -> a + b + c;

        int result = sum.apply(10, 20, 30);

        System.out.println("Sum = " + result);

    }
}
