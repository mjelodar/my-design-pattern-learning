public abstract class OrderCreator {
    Order order;

    public abstract Order createOrder();
    public abstract boolean checkMainRestriction();
    public abstract boolean checkAdminRestriction();
    public abstract boolean checkAccounting();

    public abstract boolean checkPortfolio();

    public Order getOrder(){
        return this.order;
    }
}
