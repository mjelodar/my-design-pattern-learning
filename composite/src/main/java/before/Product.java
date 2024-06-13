package before;

public class Product {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComparison(Product secondProduct){
        if (this.equals(secondProduct)){
            return "is the same";
        }else {
            return "is better than this product";
        }
    }

}
