import java.util.*;
import java.util.ArrayList; 

public class ShoppingCart {
    // Class attributes
    private List<Product> products = new ArrayList<>();
    private Order order; //instance variable order of type Order (association)
   
    // Constructor
    public ShoppingCart(List<Product> products, Order order) {
        this.products = products;
        this.order = order;
    }

     // The beginning of getters / setters:
    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

     // end of getters and setters.
    //

    // method to create a new shopping cart.
    public static ShoppingCart createCart() {
        return new ShoppingCart(new ArrayList<>(), null);
    }

//in above code block, the method createCart() returns an instance of the ShoppingCart.
}
