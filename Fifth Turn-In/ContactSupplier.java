public class ContactSupplier {
    private Date date;
    private String supplier;
    private String topic;

    // Constructor 

    public ContactSupplier(Date date,String supplier, String topic){
        this.date=date;
        this.supplier=supplier;
        this.topic=topic;
    }

    // getter/setter for date attribute 
    public Date getDate(){
        return this.date;
    }

    public void setDate(Date date){
        this.date=date;
    }
}
