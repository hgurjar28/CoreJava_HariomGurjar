package Pro_5_Product_Catalog;

public class Product {
    private int id;
    private String name;
    private double price;
    private double rating;
    private int stock;

    public Product(int id, String name, double price, double rating, int stock) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public double getRating() { return rating; }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                ", stock=" + stock +
                '}';
    }
}
