public class Product {
    //Class attributes
    private String identifier;
    private String name;
    private String description;
    private String category;

// Constructor
public Product(String identifier, String name, String description, String category) {
    this.identifier = identifier;
    this.name = name;
    this.description = description;
    this.category = category;
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

public String getDescription() {
    return this.description;
}

public void setDescription(String description) {
    this.description = description;
}

public String getCategory() {
    return this.category;
}

public void setCategory(String category) {
    this.category = category;
}

// method: productExists(quantity: int)
// quantity will exist in our database 


}
