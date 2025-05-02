
//Problem 5: Product Catalog System (TreeMap, Comparator)
//Create a Product class with id, name, price, rating, and stock.
//        •	Store products in a TreeMap<Integer, Product> keyed by id.
//        •	Sort and print products by descending rating, and then by name.



package Pro_5_Product_Catalog;

public class Main {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();


        catalog.addProduct(new Product(101, "Laptop", 950.0, 4.5,34));
        catalog.addProduct(new Product(102, "Mouse", 25.0, 4.2, 150));
        catalog.addProduct(new Product(103, "Keyboard", 55.0, 4.5, 100));
        catalog.addProduct(new Product(104, "Monitor", 200.0, 4.8, 25));
        catalog.addProduct(new Product(105, "Headphones", 75.0, 4.5, 75));
        catalog.addProduct(new Product(106, "Webcam", 80.0, 4.0, 50));
        catalog.addProduct(new Product(101, "Laptop", 950.0, 4.5,34));


        catalog.displaySortedProducts();
    }
}

