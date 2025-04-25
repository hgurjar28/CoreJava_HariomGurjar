package Q10_InventorySystem;

public class Product {
    int id;
    String name;
    double price;

    // Constructor to initialize product details
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Method to display product information
    public void displayProduct() {
        System.out.println("ID: " + id + ", Name: " + name + ", Price: ₹" + price);
    }
}

