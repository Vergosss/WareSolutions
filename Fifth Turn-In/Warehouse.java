public class Warehouse {
    private int whId;
    private String country;
    private String employees;
    private String products;
    private Employee employee;

// Constructor
public Warehouse(int whId, String country, String employees, String products, Employee employee) {
    this.whId = whId;
    this.country = country;
    this.employees = employees;
    this.products = products;
    this.employee = employee;
}

// Start of : Getters and Setters for the Warehouse Class.
public int getWhId() {
    return whId;
}

public void setWhId(int whId){
    this.whId = whId;
}

public String getCountry() {
    return country;
}

public void setCountry(String country) {
    this.country = country;
}

public String getEmployees() {
    return employees;
}

public void setEmployees(String employees) {
    this.employees = employees;
}

public String getProducts() {
    return products;
}

public void setProducts(String products) {
    this.products = products;
}

public Employee getEmployee() {
    return employee;
}

public void setEmployee(Employee employee) {
    this.employee = employee;
}

// Method to check product availability
// Number 6 of Seq Diagram. and Number 6 Use Case.

//public boolean productAvailable(String productName) {
    //First thought is to use if logic to check product availability.
    //We will check it later. 

 //   if (products.contains(productName)) {
   //     return true;
    //} else {
     //   return false;
    //}
//}

}