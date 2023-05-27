import java.util.Date;

public class Order {
    // Class attributes
    private Date Date;
    private String identifier;
    private String customer;
    private float payment;

   
     // Constructor

     public Order(Date Date, String identifier, String customer, float payment) {
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


    public String getidentifier() {
        return this.identifier;
    }

    public void setidentifier(String identifier) {
        this.identifier = identifier;
    }


    public String getcustomer() {
        return this.customer;
    }

    public void setcustomer(String customer) {
        this.customer = customer;
    }


    public float getpayment() {
        return this.payment;
    }

    public void setpayment(float payment) {
        this.payment = payment;
    }

     // end of getters and setters.
    //

}
