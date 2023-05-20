public class Customer extends User {
    private String identifier;
    private String name;

public Customer(String identifier, String name) {
this.identifier = identifier;
this.name = name;
}
 public String getIdentifier(){

    return this.identifier;
 }   
 public String getName(){
    return this.name;

 }
 public void setIdentifier(String identifier){
    this.identifier = identifier;
 }
 public void setName(String name){
    this.name = name;
 }
}
