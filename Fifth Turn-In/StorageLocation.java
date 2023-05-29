public class StorageLocation {
    //Class attributes
    private Warehouse warehouse;
    private int aisle;
    private int shelf;

    // Contructor 
    public StorageLocation(Warehouse warehouse, int aisle, int shelf) {
        this.warehouse = warehouse;
        this.aisle = aisle;
        this.shelf = shelf;

    }

    // Getters and Setters
    public int getAisle(){
        return this.aisle;
    }

    public int getShelf(){
        return this.shelf;

    }

    public Warehouse getWarehouse() {
        return this.warehouse;
    }
    
    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void setAisle(int aisle){
        this.aisle = aisle;
    }

    public void setShelf(int shelf){
        this.shelf = shelf;

    }

    // Use Case Number: 8 
    //First method: checkProductLocation() = It checks the location of a product inside the WH.
    public void checkProductLocation(){

    }

    //Second Method: changeProductLocation(Product product) = It changes the location of the product (aisle and shelf).
    public void changeProductLocation(Product product){

    }

    //Third Method: deleteLocation(Product product).
    public void deleteLocation(Product product){

    }
    public void informUserAboutOptimalLocation(){
        
    }
}
