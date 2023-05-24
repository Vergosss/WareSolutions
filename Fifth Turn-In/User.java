import java.util.Date;

public class User {
    // Class attributes
    enum type {
        CUSTOMER,
        WAREHOUSEDEPARTMENT,
        MANAGEMENTDEPARTMENT

    }

    private Date dateOfCreation;

    // Getters and Setters
    public Date getDateOfCreation() {
        return this.dateOfCreation;

    }

    public void setDateOfCreation(Date dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }

}
