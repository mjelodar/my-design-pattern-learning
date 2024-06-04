package omsWithFactoryMethod.sender;

import omsWithFactoryMethod.FixOrder;
import omsWithFactoryMethod.Order;
import omsWithFactoryMethod.SimpleOrder;

public class SimpleSender extends OrderSender{
    @Override
    public Order createOrder() {
        return new SimpleOrder();
    }
}
