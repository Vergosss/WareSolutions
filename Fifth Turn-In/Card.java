import java.time.LocalDate;
public class Card{

    // Class attributes
    private String name;
    
    private int year;
    private int month;
    private int day;
    LocalDate expiration_date = LocalDate.of(year,month,day);

    //Constructor

    public Card(String name,LocalDate expiration_date){
        this.name=name;
        this.expiration_date=expiration_date;
    }



}