package Pro_5_Product_Catalog;

import java.util.*;

public class ProductCatalog {
    private TreeMap<Integer, Product> productMap = new TreeMap<>();

    public void addProduct(Product p) {
        productMap.put(p.getId(), p);
    }

    public void displaySortedProducts() {
        List<Product> products = new ArrayList<>(productMap.values());
        products.sort(new ProductComparator());

        System.out.println("Products sorted by rating (desc) then name:");
        for (Product p : products) {
            System.out.println(p);
        }
    }
}
