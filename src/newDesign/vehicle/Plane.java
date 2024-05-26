package newDesign.vehicle;

import newDesign.Transaction;

public class Plane implements Vehicles{

    public void go(Transaction transaction){
        System.out.println("go to " + transaction.getDestination() + " with PLANE" );
    }
}
