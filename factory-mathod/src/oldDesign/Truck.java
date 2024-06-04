package oldDesign;

public class Truck {
    Transaction transaction;

    public Truck(Transaction transaction) {
        System.out.println("i am a truck");
        this.transaction = transaction;
    }


    public void go(){
        System.out.println("i am going to " + transaction.getDestination());
    }

}
