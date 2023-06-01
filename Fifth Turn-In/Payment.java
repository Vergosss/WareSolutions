import java.time.LocalDate;

//Class attributes
public class Payment {
    private String identifier;
    private LocalDate date;
    private String method;
    private float amount;
    private Order order;

    // Constructor
    public Payment(String identifier, String method, float amount, Order order) {
        this.identifier = identifier;
        this.date = LocalDate.now();
        this.method = method;
        this.amount = amount;

    }

    // getters and setters for identifier attribute

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // getters and setters for method

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    // getters and setters for amount
    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getAmount() {
        return this.amount;
    }

    //getters and setters for payment_date
    
    public LocalDate getPaymentDate() {
        return this.date;
    }

    public void setPaymentDate() {
        this.date = LocalDate.now();
    }

    //getters and setters for order
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    //Methods: 

    //public boolean CheckPaymentAvailability() {

    //}

    //public void executePayment() {
        
    //}

}
