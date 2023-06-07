import java.util.Date;

public class Customer extends User {
   // Class attributes
   private String identifier;
   private String name;
   private Profile profile;
   private Order order;

   // Constructor
   public Customer(String identifier, String name, Profile profile, Order order) {
      this.identifier = identifier;
      this.name = name;
      this.profile = profile;
      this.order = order;
   }

   // Getters and Setters
   public String getIdentifier() {
      return this.identifier;
   }

   public String getName() {
      return this.name;
   }

   public void setIdentifier(String identifier) {
      this.identifier = identifier;
   }

   public void setName(String name) {
      this.name = name;
   }
   
   public Profile getProfile() {
      return this.profile;
   }

   public void setProfile(Profile profile) {
      this.profile = profile;
   }

   public Order getOrder() {
      return this.order;
   }

   public void setOrder(Order order) {
      this.order = order;
   }

//Beginning of methods in Customer class!!
   // Method to edit profile
   public void editProfile(String customerName, String password, String location) {
      if (profile != null) {
          profile.setCustomerName(customerName);
          profile.setPassword(password);
          profile.setLocation(location);
          System.out.println("Profile updated successfully.");
      } else {
          System.out.println("No profile found. Please set a profile for the customer.");
      }
  }
  // Method to add credentials
  public void addCredentials(String newPassword) {
   if (profile != null) {
       try {
           if (newPassword.length() < 8) {
               throw new IllegalArgumentException("New Password must be at least 8 characters long!");
           }
           profile.setPassword(newPassword);
           System.out.println("Credentials added successfully.");
       } catch (IllegalArgumentException e) {
           System.out.println("Error: " + e.getMessage());
       }
    } else {
       System.out.println("No profile found. Please set a profile for the customer.");
    }
   }

   // Method to change credentials: 
   public void changeCredentials(String newPassword) {
      try{
          if (newPassword.length() < 8) {
              throw new IllegalArgumentException("New Password Must be at least <8> characters long!!");
          }
          profile.setPassword(newPassword);
          System.out.println("Credentials changed successfully.");
      } catch(IllegalArgumentException e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
  //Method to create Order:
   public void createOrder(String identifier, Payment payment) {
      if (profile == null) {
       System.out.println("No profile found. Please set a profile for the customer.");
       return;
      }
   
      Date date = new Date(); // Current date and time
      order = new Order(date, identifier, this, payment); //'this' referes to the current instance of the Customer class.
      System.out.println("Order created successfully.");
   }

   //Method to confirm the order()
   public void confirm() {
      if (order == null) {
          System.out.println("No order found. Please create an order first.");
          return;
      }
  
      // Perform confirmation logic here
      System.out.println("Order confirmed. Thank you for your purchase!");
      System.out.println("Order details:");
      System.out.println("Date: " + order.getDate());
      System.out.println("Identifier: " + order.getIdentifier());
      System.out.println("Customer: " + order.getCustomer().getName());
      System.out.println("Payment: " + order.getPayment().getMethod());
  
      // Additional logic can be added here as needed
  
      order = null; // Reset the current order after confirmation
  }

}
