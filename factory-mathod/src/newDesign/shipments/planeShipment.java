package newDesign.shipments;


import newDesign.vehicle.Plane;
import newDesign.vehicle.Vehicles;

public class planeShipment extends Shipment {
    @Override
    public Vehicles createShipment() {
        return new Plane();
    }
}
