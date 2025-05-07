
//Chain operations on a list of Orders: filter by date range, map to total amount, sum all totals.
package FunctionalProExercise.Q_50_ChainOperationOnList;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class OrderTotalByDate {
    public static void main(String[] args) {
        class Order {
            LocalDate date;
            double amount;

            public Order(LocalDate date, double amount) {
                this.date = date;
                this.amount = amount;
            }
        }

        List<Order> orders = Arrays.asList(
                new Order(LocalDate.of(2023, 1, 5), 100),
                new Order(LocalDate.of(2023, 2, 10), 200),
                new Order(LocalDate.of(2023, 3, 15), 300),
                new Order(LocalDate.of(2022, 12, 31), 50)
        );


        LocalDate start = LocalDate.of(2023, 1, 1);
        LocalDate end = LocalDate.of(2023, 3, 31);

        double total = orders.stream()
                .filter(order -> !order.date.isBefore(start) && !order.date.isAfter(end))
                .mapToDouble(order -> order.amount)
                .sum();

        System.out.println("Total amount from Jan-Mar 2023: $" + total);
    }
}

