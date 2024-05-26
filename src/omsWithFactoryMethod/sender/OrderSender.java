package omsWithFactoryMethod.sender;

import omsWithFactoryMethod.Order;

public abstract class OrderSender {
    public abstract Order createOrder();

    public void sendOrder(){
        Order order = createOrder();
        order.sendToMarket();
    }
}
