package newDesign;

import newDesign.shipments.Shipment;

import java.util.Date;

public class Transaction {
    private String destination;
    private Date issueDate;

    public Transaction(String destination, Date issueDate) {
        this.destination = destination;
        this.issueDate = issueDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}
