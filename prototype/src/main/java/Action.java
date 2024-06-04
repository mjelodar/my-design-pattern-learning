public class Action {
    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("Hiiiiiii");
//        VehiclesTypes vehiclesTypes = VehiclesTypes.TRUCk;
        Truck truck = new Truck("Iran");
        Shipment shipment = new Shipment(truck);


        shipment.createShipment("canada");
        shipment.createShipment(null);

        Ship ship = new Ship("IRAN");
        Shipment shipment1 = new Shipment(ship);
        shipment1.createShipment(null);
//        Vehicles truck1 = truck.cloneVehicles();
////        truck1.
//        truck1.delivery();
    }
}
