import java.time.LocalDate;

//Class attributes
public class Payment {
    private String identifier;
    private LocalDate date;
    private String method;

    // Constructor

    public Payment(String identifier, String method) {
        this.identifier = identifier;
        this.date = LocalDate.now();
        this.method = method;

    }

    // getters and setters for identifier attribute

    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    // getters and setters for payment_method

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }
}
