public class OrderProgress {
    private int orderId;
    private String destination;
    private Status status;

    public enum Status {
        PENDING,
        PROCESSING,
        SHIPPED,
        OUT_FOR_DELIVERY,
        DELIVERED,
        ON_HOLD,
        CANCELLED,
        RETURNED,
        COMPLETED
    }

    // Constructor: 
    public OrderProgress(int orderId, String destination, Status status) {
        this.orderId = orderId;
        this.destination = destination;
        this.status = status;
    }

    //Getters and Setters: 
    public int getOrderId() {
        return orderId;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
