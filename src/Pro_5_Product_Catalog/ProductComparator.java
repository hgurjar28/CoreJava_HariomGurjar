package Pro_5_Product_Catalog;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        int ratingCompare = Double.compare(p2.getRating(), p1.getRating());
        if (ratingCompare == 0) {
            return p1.getName().compareTo(p2.getName());
        }
        return ratingCompare;
    }
}

