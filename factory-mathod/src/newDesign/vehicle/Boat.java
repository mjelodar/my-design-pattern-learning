package newDesign.vehicle;


import newDesign.Transaction;

public class Boat implements Vehicles{

    @Override
    public void go(Transaction transaction) {
        System.out.println("go to " + transaction.getDestination() + " with BOAT");
    }

}
