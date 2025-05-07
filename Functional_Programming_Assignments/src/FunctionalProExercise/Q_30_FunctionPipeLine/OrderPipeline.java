
//Implement a function pipeline to process orders (e.g., filter by status, sort by amount, map to customer name).
package FunctionalProExercise.Q_30_FunctionPipeLine;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderPipeline {


    static class Order {
        String customer;
        String status;
        double amount;

        public Order(String customer, String status, double amount) {
            this.customer = customer;
            this.status = status;
            this.amount = amount;
        }
    }

    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order("Mukesh", "COMPLETED", 300),
                new Order("Nitin", "PENDING", 150),
                new Order("Anand", "COMPLETED", 450)
        );


        List<String> processed = orders.stream()
                .filter(o -> o.status.equals("COMPLETED"))
                .sorted(Comparator.comparingDouble(o -> o.amount))
                .map(o -> o.customer)
                .collect(Collectors.toList());

        System.out.println("Processed customers: " + processed);
    }
}
