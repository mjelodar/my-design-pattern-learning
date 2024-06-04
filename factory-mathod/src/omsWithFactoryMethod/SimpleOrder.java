package omsWithFactoryMethod;

public class SimpleOrder extends Order{
    @Override
    public void sendToMarket() {
        System.out.println("send this order as ordinary order");
    }
}
