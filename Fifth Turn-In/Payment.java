import java.time.LocalDate;

//Class attributesb
public class Payment {
    private String identifier;
    private LocalDate payment_date;
    private String payment_method;

    // Constructor

    public Payment(String identifier, String payment_method) {
        this.identifier = identifier;
        this.payment_date = LocalDate.now();
        this.payment_method = payment_method;
        
    }

    //getters and setters for identifier attribute 

    public String getidentifier() {
        return this.identifier;
    }
 
    public void setidentifier(String identifier) {
        this.identifier = identifier;
    }

    //getters and setters for payment_method

    public String getpaymentmethod() {
        return this.payment_method;
    }

    public void setpaymentmethod(String payment_method) {
        this.payment_method = payment_method;
    }

    //getters and setters for payment_date
    
    public LocalDate getpaymentdate() {
        return this.payment_date;
    }

    public void setpaymentdate() {
        this.payment_date = LocalDate.now();
    }
}
