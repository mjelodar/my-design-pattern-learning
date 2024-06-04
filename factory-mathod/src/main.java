
import newDesign.shipments.SeaShipment;
import newDesign.shipments.Shipment;
import newDesign.shipments.TruckShipment;
import newDesign.shipments.planeShipment;
import omsWithFactoryMethod.sender.FixSender;
import omsWithFactoryMethod.sender.OrderSender;

public class main {
    public static void main(String[] args) {
//        Shipment seaShipment = new SeaShipment();
//        seaShipment.delivery();
//
//        Shipment truckShipment = new TruckShipment();
//        truckShipment.delivery();
//
//        Shipment planeShipment = new planeShipment();
//        planeShipment.delivery();

        OrderSender fix = new FixSender();
        fix.sendOrder();
    }



}
