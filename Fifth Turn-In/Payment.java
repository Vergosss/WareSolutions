import java.time.LocalDate;

//Class attributesb
public class Payment {
    private String identifier;
    private LocalDate payment_date;
    private String method;

    // Constructor

    public Payment(String identifier, String method) {
        this.identifier = identifier;
        this.payment_date = LocalDate.now();
        this.method = method;
        
    }

    //getters and setters for identifier attribute 

    public String getidentifier() {
        return this.identifier;
    }
 
    public void setidentifier(String identifier) {
        this.identifier = identifier;
    }
}
