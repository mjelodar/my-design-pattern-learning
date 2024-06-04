public class Ship extends Vehicles{
    VehiclesTypes type = VehiclesTypes.BOAT;



    public Ship() {
        this.vehiclesTypes = type;
    }

    public Ship(String destination) {
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
