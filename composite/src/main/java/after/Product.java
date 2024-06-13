package after;

import java.util.List;

public interface Product {
    double getProductPrice();
    void add(Product p);
    String compare(Product p1, Product p2);
    void remove(Product p);
    List<Product> getProducts();
}
