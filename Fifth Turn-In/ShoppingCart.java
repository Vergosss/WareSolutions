import java.util.*;

public class ShoppingCart {
    // Class attributes
    private List<Product> products = new ArrayList<>();

    // Constructor

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }


     // The beginning of getters / setters 
     public List<Product> getproducts() {
        return this.products;
    }

    public void setproducts(List<Product> products) {
        this.products = products;
    }


     // end of getters and setters.
    //
}
