package newDesign.shipments;

import newDesign.vehicle.Truck;
import newDesign.vehicle.Vehicles;


public class TruckShipment extends Shipment {

    @Override
    public Vehicles createShipment() {
        return new Truck();
    }
}
