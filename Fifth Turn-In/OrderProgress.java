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
}
