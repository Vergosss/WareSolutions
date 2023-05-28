public class Supplier {
    private String identifier;
    private String brand;

    //Constructor 

    public Supplier(String identifier, String brand) {
        this.identifier = identifier;
        this.brand = brand;
     }

     //getter and setter for identifier attribute

     public String getIdentifier(){
        return this.identifier;
     }

     public void setIdentifier(String identifier){
        this.identifier=identifier;
     }

     //getter and setter for brand attribute 

     public String getBrand(){
        return this.brand;
     }

     public void setBrand(String brand){
        this.brand=brand;
     }

}
