package before;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<Product> productList = new ArrayList<>();

    public void add(Product product){
        getProductList().add(product);
    }

    public void remove(Product product){
        getProductList().removeIf(p -> p.equals(product));
    }

    public double calculatePrice(){
        double totalPrice = 0D;
        for (Product p: getProductList()) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
