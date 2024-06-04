package omsWithFactoryMethod;

public class FixOrder extends Order{
    @Override
    public void sendToMarket() {
        System.out.println("send this order as FIX order");
    }
}
