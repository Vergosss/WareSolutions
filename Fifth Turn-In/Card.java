public class Card {

    // Class attributes
    private String holderName;
    private Date expirationDate;
    private int cardNumber;
    private int cvc;

    // Constructor

    public Card(String holderName, Date expirationDate, int cardNumber, int cvc) {
        this.holderName = holderName;
        this.expirationDate = expirationDate;
        this.cardNumber = cardNumber;
        this.cvc = cvc;
    }

    // Getters and Setters for Cardholders name

    public String getHolderName() {
        return this.holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    // Getters and Setters for Expiration_date

    public Date getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    // Getters and Setters for Card Number

    public int getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Getters and Setters for CVC

    public int getCVC() {
        return this.cvc;
    }

    public void setCVC(int cvc) {
        this.cvc = cvc;
    }
}