public class StorageLocation {
    private int aisle;
    private int shelf;
    public StorageLocation(int aisle, int shelf) {
        this.aisle = aisle;
        this.shelf = shelf;

    }
    public int getAisle(){
        return this.aisle;
    }
    public int getShelf(){
        return this.shelf;

    }
    public void setAisle(int aisle){
        this.aisle = aisle;
    }
    public void setShelf(int shelf){
        this.shelf = shelf;

    }
}
