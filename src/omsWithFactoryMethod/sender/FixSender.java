package omsWithFactoryMethod.sender;

import omsWithFactoryMethod.FixOrder;
import omsWithFactoryMethod.Order;

public class FixSender extends OrderSender{
    @Override
    public Order createOrder() {
        return new FixOrder();
    }
}
