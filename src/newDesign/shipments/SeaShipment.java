package newDesign.shipments;


import newDesign.vehicle.Boat;
import newDesign.vehicle.Vehicles;
import oldDesign.Transaction;

public class SeaShipment extends Shipment {
    @Override
    public Vehicles createShipment() {
        return new Boat();
    }
}
