public class Warehouse {
    private String country;
    private String employees;
    private String products;
    private Employee employee;

// Constructor
public Warehouse(String country, String employees, String products, Employee employee) {
    this.country = country;
    this.employees = employees;
    this.products = products;
    this.employee = employee;
}

// Start of : Getters and Setters for the Warehouse Class.
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


}