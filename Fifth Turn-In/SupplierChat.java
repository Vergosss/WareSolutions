public class SupplierChat {
    private Date date;
    private Supplier supplier;
    private String topic;

    // Constructor 

    public SupplierChat(Date date,Supplier supplier, String topic){
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

    //getter/setter for supplier

    public Supplier getSupplier(){
        return this.supplier;
    }

    public void setSupplier(Supplier supplier){
        this.supplier=supplier;
    }

    // getter/setter for topic attribute 

    public String getTopic(){
        return this.topic;
    }

    public void setTopic(String topic){
        this.topic=topic;
    }

}
