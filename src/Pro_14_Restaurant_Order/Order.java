package Pro_14_Restaurant_Order;

public class Order {
    private int orderId;
    private String description;

    public Order(int orderId, String description) {
        this.orderId = orderId;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Description: " + description;
    }
}

