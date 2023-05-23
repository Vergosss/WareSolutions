public class Product {
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

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public String getCategory() {
    return category;
}

public void setCategory(String category) {
    this.category = category;
}

}
