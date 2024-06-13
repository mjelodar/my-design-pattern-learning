package after;

import java.util.List;

public class BuyAssistant {
    Product product;

    public BuyAssistant(Product product) {
        this.product = product;
    }

    public double getPriceOfBasket(List<Product> p){
        double totalPrice = 0;
        for (Product product: p) {
            if (product.getProductPrice() == 0){
                getPriceOfBasket(product.getProducts());
            }
            totalPrice += product.getProductPrice();
        }
        return totalPrice;
    }

    public double getPrice(Product p){
        return p.getProductPrice();
    }
}
