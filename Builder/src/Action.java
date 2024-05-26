public class Action {
    public static void main(String[] args) {
        Director director = new Director();
        OrderCreator order1 = new SimpleOrder();
        BuilderConfigurer builderConfigurer = new BuilderConfigurer(director);
        builderConfigurer.createOrder(order1);

        OrderCreator conditionalOrder = new ConditionalOrder();
        builderConfigurer.createOrder(conditionalOrder);
        
    }
}
