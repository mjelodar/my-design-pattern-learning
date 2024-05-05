public class BuilderConfigurer {
    Director director;
    public Order createOrder(OrderCreator order){
        director.buildOrder(order);

        return new Order();
    }
}
