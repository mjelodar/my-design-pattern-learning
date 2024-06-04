public abstract class Vehicles implements Cloneable{
    VehiclesTypes vehiclesTypes;
    String destination;

    abstract Vehicles cloneVehicles() throws CloneNotSupportedException;

    public abstract void delivery();

    public VehiclesTypes getVehiclesTypes() {
        return vehiclesTypes;
    }

    public void setVehiclesTypes(VehiclesTypes vehiclesTypes) {
        this.vehiclesTypes = vehiclesTypes;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
