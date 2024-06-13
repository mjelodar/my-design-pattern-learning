package before;

public class ActionComposite {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setPrice(510);

        Product p2 = new Product();
        p2.setPrice(4120);

        Basket b1 = new Basket();
        b1.add(p1);
        b1.add(p2);

        BuyAssistant buyAssistant = new BuyAssistant();
        buyAssistant.setBasket(b1);
        System.out.println("total cost is :: " + buyAssistant.getPriceOfBasket());

        System.out.println("comparison result :: " + buyAssistant.comparison(p1, p2));
    }
}
