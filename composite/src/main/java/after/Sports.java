package after;

import java.util.List;

public class Sports implements Product{
    double price;

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public double getProductPrice() {
        return this.getPrice();
    }

    @Override
    public void add(Product p) {

    }

    @Override
    public String compare(Product p1, Product p2) {
        return null;
    }

    @Override
    public void remove(Product p) {

    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
