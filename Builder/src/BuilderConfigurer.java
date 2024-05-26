public class BuilderConfigurer {
    Director director;

    public BuilderConfigurer(Director director) {
        this.director = director;
    }

    public Order createOrder(OrderCreator orderCreator){
        director.buildOrder(orderCreator);

        return orderCreator.getOrder();
    }
}
