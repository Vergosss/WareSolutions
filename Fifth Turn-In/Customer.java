public class Customer extends User {
   // Class attributes
   private String identifier;
   private String name;
   private Profile profile;

   // Constructor
   public Customer(String identifier, String name, Profile profile) {
      this.identifier = identifier;
      this.name = name;
      this.profile = profile;
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
  
}
