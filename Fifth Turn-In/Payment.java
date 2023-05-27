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


}
