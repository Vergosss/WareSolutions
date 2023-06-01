public class Profile {
    //Class attributes
    private String customerName;
    private String password;
    private String location; 
    private Employee employee;  //assosiation 


    // Constructor
    public Profile(String customerName, String password, String location, Employee employee) {
        this.customerName = customerName;
        this.password = password;
        this.location = location;
        this.employee = employee; 
    }

    // Getters and Setters For EditProfile Use Case
    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Employee getEmployee() {
        return this.employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }



    // Method to show the profile
    public void showProfile() {
        System.out.println("Customer Name: " + getCustomerName());
        System.out.println("Password: " + getPassword());
        System.out.println("Location: " + getLocation());
    }

    //Method to check credentials 
    public boolean checkCredentials(String enteredPassword) {
        return getPassword().equals(enteredPassword);
    }

    //Method to change credentials 
    public void changeCredentials(String newPassword) {
        setPassword(newPassword);
        System.out.println("Credentials changed successfully.");
    }

}