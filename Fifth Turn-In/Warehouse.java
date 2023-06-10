import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    //Class attributes
    private int whId;
    private String country;
    private List<Employee> employees = new ArrayList<>();    
    private List<Product> products = new ArrayList<>();
    
    // Constructor
    public Warehouse(int whId, String country, List<Employee> employees, List<Product> products) {
        this.whId = whId;
        this.country = country;
        this.employees = employees;
        this.products = products;
        
    }

    // Start of : Getters and Setters for the Warehouse Class.
    public int getWhId() {
        return whId;
    }

    public void setWhId(int whId) {
        this.whId = whId;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    /*
     * public void setProducts(String products) {
     * this.products = products;
     * }
     */
    public void setProducts(List<Product> products) {
        this.products = products;
    }

 
    // Method to check product availability
    // Number 6 of Seq Diagram. and Number 6 Use Case.

    // public boolean productAvailable(String productName) {
    // First thought is to use if logic to check product availability.
    // We will check it later.

    // if (products.contains(productName)) {
    // return true;
    // } else {
    // return false;
    // }
    // }
    //number 9 of sequence diagram and number 9 Use Case
    public void createWareHouse(){

    }
    //number 15 of sequence diagram and number 15 Use Case
    public void addWorker(Employee employee){

    }
    //number 5 of sequence diagram and number 5 Use Case
    public void changeWareHousePriority(){

    }
    public void checkWarehouseRequirements(){
        //method to check warehouse requirements- use case 15
    }
}