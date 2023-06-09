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

    // Getter-Setters
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

    public Customer getCustomer() {
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

    // Begin of Methods:

    public void serveOrder(Date Date, String identifier, String customer, float payment)
    {
     //serveOrder checks if Order can be completed.
    }


}
