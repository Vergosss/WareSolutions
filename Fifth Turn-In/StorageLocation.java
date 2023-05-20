public class StorageLocation {
    private String warehouse;
    private int aisle;
    private int shelf;

    // Contructor 
    public StorageLocation(String warehouse, int aisle, int shelf) {
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

    public String getWarehouse() {
        return warehouse;
    }
    
    public void setWarehouse(String warehouse) {
        this.warehouse = warehouse;
    }

    public void setAisle(int aisle){
        this.aisle = aisle;
    }

    public void setShelf(int shelf){
        this.shelf = shelf;

    }
}
