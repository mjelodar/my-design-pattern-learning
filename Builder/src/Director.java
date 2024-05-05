public class Director {

    public void buildOrder(OrderCreator creator){
        creator.checkMainRestriction();
        creator.checkAdminRestriction();
        creator.checkAccounting();
        creator.checkPortfolio();
    }
}
