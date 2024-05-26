package newDesign.shipments;

import newDesign.Transaction;
import newDesign.vehicle.Vehicles;

import java.util.Date;

public abstract class Shipment {
    public abstract Vehicles createShipment();

    public void delivery(){
        Vehicles vehicles = createShipment();
        Transaction transaction = new Transaction("qom", new Date());
        vehicles.go(transaction);
    }
}
