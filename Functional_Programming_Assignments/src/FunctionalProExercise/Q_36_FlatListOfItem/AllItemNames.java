
//You have a list of Order objects, each with a list of Items. Return a flat list of all item names.
package FunctionalProExercise.Q_36_FlatListOfItem;
import java.util.List;
import java.util.stream.Collectors;

public class AllItemNames {

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
                new Order(List.of(new Item("Pen", 1.5), new Item("Notebook", 3))),
                new Order(List.of(new Item("Pencil", 1), new Item("Eraser", 0.5)))
        );

        List<String> allItemNames = orders.stream()
                .flatMap(order -> order.items.stream())
                .map(item -> item.name)
                .collect(Collectors.toList());

        System.out.println("All Item Names: " + allItemNames);
    }
}
