public class Customer extends User {
   // Class attributes
   private String identifier;
   private String name;

   // Constructor
   public Customer(String identifier, String name) {
      this.identifier = identifier;
      this.name = name;
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

}
