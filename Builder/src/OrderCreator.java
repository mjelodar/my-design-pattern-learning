public abstract class OrderCreator {
    private Order order;

    public abstract boolean checkMainRestriction();
    public abstract boolean checkAdminRestriction();
    public abstract boolean checkAccounting();
    public abstract boolean checkPortfolio();

    public Order getOrder(){
        return this.order;
    }
}
