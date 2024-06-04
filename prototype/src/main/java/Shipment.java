public class Shipment {
    private Vehicles vehicles;

    public Shipment(Vehicles vehicles) {
        this.vehicles = vehicles;
    }

    public void createShipment(String destination) throws CloneNotSupportedException {
        Vehicles vehicle = vehicles.cloneVehicles();
        if ( destination!= null)
            vehicle.setDestination(destination);
        vehicle.delivery();
    }
}
