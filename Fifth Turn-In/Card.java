import java.time.LocalDate;
public class Card{

    // Class attributes
    private String name;
    
    private int year;
    private int month;
    private int day;
    LocalDate expiration_date = LocalDate.of(year,month,day);
    private int card_number;
    private int cvc;

    //Constructor

    public Card(String name,LocalDate expiration_date,int card_number, int cvc){
        this.name=name;
        this.expiration_date=expiration_date;
        this.card_number=card_number;
        this.cvc=cvc;
    }

    //Getters and Setters for Cardholders name

    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name=name;
    }

     //Getters and Setters for Expiration_date

     public LocalDate getExpirationDate(){
        return this.expiration_date;
    }

    public void setExpirationDate(LocalDate expiration_date){
        this.expiration_date=expiration_date;
    }

    

}