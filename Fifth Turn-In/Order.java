import java.util.Date;

public class Order {
    // Class attributes
    private Date Date;
    private String identifier;
    private Customer customer;
    private Payment payment;

   
     // Constructor

     public Order(Date Date, String identifier, Customer customer, Payment payment) {
        this.Date = Date;
        this.identifier = identifier;
        this.customer = customer;
        this.payment = payment;

    }

    // The beginning of getters / setters 
    public Date getDate() {
        return this.Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }


    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }


    public Customer geCcustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }


    public Payment getPayment() {
        return this.payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

     // end of getters and setters.
    //

}
