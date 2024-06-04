public class Truck extends Vehicles{
    VehiclesTypes type = VehiclesTypes.TRUCk;

    public Truck() {
        this.vehiclesTypes = type;
    }

    public Truck(String destination) {
        this.vehiclesTypes = type;
        this.destination = destination;
    }

    Vehicles cloneVehicles() throws CloneNotSupportedException {
        return (Vehicles) this.clone();
    }

    public void delivery() {
        System.out.println("Send staff with " + this.vehiclesTypes + " to " + this.destination);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
