public class Director {


    public void buildOrder(OrderCreator creator){
        creator.createOrder();
        creator.checkMainRestriction();
        creator.checkAdminRestriction();
        creator.checkAccounting();
        creator.checkPortfolio();
    }
}
