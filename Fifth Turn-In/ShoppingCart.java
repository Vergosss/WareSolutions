import java.util.*;
import java.util.ArrayList; 

public class ShoppingCart {
    // Class attributes
    private List<Product> products = new ArrayList<>();

    // Constructor

    public ShoppingCart(List<Product> products) {
        this.products = products;
    }


     // The beginning of getters / setters 
     public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


     // end of getters and setters.
    //

    // method to create a new shopping cart.
    public static ShoppingCart createCart() {
        return new ShoppingCart(new ArrayList<>());
    }

//in above code block, the method createCart() returns an instance of the ShoppingCart.
}
