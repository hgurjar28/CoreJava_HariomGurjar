
//Find the order with the highest total item price.
package FunctionalProExercise.Q_37_OrderWithhighestTotal;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxTotalOrder {

    static class Item {
        String name;
        double price;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }
    }

    static class Order {
        List<Item> items;

        Order(List<Item> items) {
            this.items = items;
        }
    }

    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order(List.of(new Item("Book", 10), new Item("Pen", 2))),
                new Order(List.of(new Item("Laptop", 1000), new Item("Mouse", 25))),
                new Order(List.of(new Item("Bag", 50)))
        );

        Order maxOrder = orders.stream()
                .max(Comparator.comparingDouble(order ->
                        order.items.stream().mapToDouble(item -> item.price).sum()))
                .orElse(null);

        if (maxOrder != null) {
            System.out.println("Order with highest total: " +
                    maxOrder.items.stream()
                            .map(item -> item.name)
                            .collect(Collectors.toList()));
        } else {
            System.out.println("No orders found.");
        }
    }
}
