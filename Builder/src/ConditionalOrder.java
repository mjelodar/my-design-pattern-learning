public class ConditionalOrder extends OrderCreator{

    public ConditionalOrder() {
        System.out.println("i'm a conditional order.");
    }

    public Order createOrder(){
       this.order = new Order();
       return order;
    }

    @Override
    public boolean checkMainRestriction() {
        return (order.getPrice() != 0 && order.getQuantity()!= 0 && order.getSide() != null);
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
