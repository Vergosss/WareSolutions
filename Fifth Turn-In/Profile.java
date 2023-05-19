public class Profile {
    private String customerName;
    private String password;
    private String location;

    // Constructor
    public Profile(String customerName, String password, String location) {
        this.customerName = customerName;
        this.password = password;
        this.location = location;
    }

    // Getters and Setters For EditProfile Use Case
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Method to show the profile
    public void showProfile() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Password: " + password);
        System.out.println("Location: " + location);
    }
}