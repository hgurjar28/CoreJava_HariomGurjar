package Q10_InventorySystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an array of products
        Product[] products = new Product[3];
        products[0] = new Product(1, "Laptop", 55000.00);
        products[1] = new Product(2, "Smartphone", 30000.00);
        products[2] = new Product(3, "Headphones", 2500.00);

        // Create a store and pass the product array
        Store store = new Store(products);

        // Display all products
        store.displayAllProducts();

        // Find product with highest price
        store.findMostExpensiveProduct();

        // Search for a product by name
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name to search: ");
        String searchName = scanner.nextLine();

        store.searchProductByName(searchName);

        scanner.close();
    }
}
