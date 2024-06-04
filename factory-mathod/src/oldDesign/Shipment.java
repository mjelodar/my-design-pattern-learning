package oldDesign;

import java.util.Date;

public class Shipment {

    public void deliver(){
        Transaction transaction = new Transaction();
        transaction.setDestination("kashan");
        transaction.setRequestDate(new Date());
        oldDesign.Truck truck = new Truck(transaction);
        truck.go();
    }
}
