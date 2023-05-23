public class Employee {
    //Class attributes
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
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Method to show the employee's profile
    public void showEmployee() {
        System.out.println("Identifier: " + identifier);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}