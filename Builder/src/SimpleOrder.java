public class SimpleOrder extends OrderCreator{

    public SimpleOrder() {
        System.out.println("i'm a simple order.");
    }

    @Override
    public boolean checkMainRestriction() {
        return (getOrder().getPrice() != 0 && getOrder().getQuantity()!= 0 && getOrder().getSide() != null);
    }

    @Override
    public boolean checkAdminRestriction() {
        return true;
    }

    @Override
    public boolean checkAccounting() {
        return true;
    }

    @Override
    public boolean checkPortfolio() {
        return true;
    }
}
