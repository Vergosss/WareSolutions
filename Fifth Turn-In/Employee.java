public class Employee {
    // Class attributes
    private String identifier;
    private String name;
    private String department;

    // Constructor
    public Employee(String identifier, String name, String department) {
        this.identifier = identifier;
        this.name = name;
        this.department = department;
    }

    // Getters and Setters
    public String getIdentifier() {
        return this.identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to show the employee's info
    public void showEmployee() {
        System.out.println("Identifier: " + getIdentifier());
        System.out.println("Name: " + getName());
        System.out.println("Department: " + getDepartment());
    }
}