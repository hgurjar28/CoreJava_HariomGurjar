package Q10_InventorySystem;

public class Store {
    Product[] products;  // Array of products

    // Constructor to initialize the store with products
    public Store(Product[] products) {
        this.products = products;
    }

    // Method to display all products
    public void displayAllProducts() {
        System.out.println("All Products:");
        for (Product p : products) {
            p.displayProduct();
        }
    }

    // Method to find the product with the highest price
    public void findMostExpensiveProduct() {
        if (products.length == 0) return;

        Product max = products[0];

        for (Product p : products) {
            if (p.price > max.price) {
                max = p;
            }
        }

        System.out.println("Most Expensive Product:");
        max.displayProduct();
    }

    // Method to search for a product by name
    public void searchProductByName(String name) {
        boolean found = false;
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                System.out.println("Product Found:");
                p.displayProduct();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product with name: " + name + " , not found.");
        }
    }
}
