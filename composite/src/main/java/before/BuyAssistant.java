package before;

public class BuyAssistant {
    Basket basket;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public double getPriceOfProduct(Product p){
        return p.getPrice();
    }

    public double getPriceOfBasket(){
        return getBasket().calculatePrice();
    }

    public String comparison(Product comparedProduct, Product compareeProduct){
        return comparedProduct.getComparison(compareeProduct);
    }
}
