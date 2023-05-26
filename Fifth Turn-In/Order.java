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

}
