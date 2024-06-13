package after;

import java.util.ArrayList;
import java.util.List;

public class Basket implements Product{
    List<Product> products;
    @Override
    public double getProductPrice() {
        return 0;
    }

    @Override
    public void add(Product p) {
        if (products == null)
            products = new ArrayList<>();

        products.add(p);
    }

    @Override
    public String compare(Product p1, Product p2) {
        return p1.equals(p2)?"OK":"NOK";
    }

    @Override
    public void remove(Product p) {
        for (Product product:products) {
            if (p.equals(product))
                products.remove(p);
        }
    }

    @Override
    public List<Product> getProducts() {
        return this.products;
    }
}
