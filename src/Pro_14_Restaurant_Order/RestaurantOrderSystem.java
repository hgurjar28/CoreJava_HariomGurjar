package Pro_14_Restaurant_Order;
import java.util.*;

public class RestaurantOrderSystem {
    private final Deque<Order> currentOrders = new ArrayDeque<>();;
    private final  List<Order> orderHistory = new ArrayList<>();;

    public void addOrderToFront(Order order) {
        currentOrders.addFirst(order);
    }

    public void addOrderToBack(Order order) {
        currentOrders.addLast(order);
    }

    public void  removeOrderFromFront() {
        Order order = currentOrders.pollFirst();
        if (order != null) orderHistory.add(order);
        System.out.println("Order Removed");
    }

    public void removeOrderFromBack() {
        System.out.println("Order Removed");

        Order order = currentOrders.pollLast();
        if (order != null) orderHistory.add(order);
    }

    public void printCurrentOrders() {
        System.out.println("Current Orders:");
        for (Order o : currentOrders) {
            System.out.println(o);
        }
    }

    public void printOrderHistory() {
        System.out.println("Order History:");
        for (Order o : orderHistory) {
            System.out.println(o);
        }
    }
}
