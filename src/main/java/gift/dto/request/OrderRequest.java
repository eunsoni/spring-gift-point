package gift.dto.request;

public class OrderRequest {
    private final Long id;
    private final Long optionId;
    private final int quantity;
    private final String message;

    public OrderRequest(Long id, Long optionId, int quantity, String message) {
        this.id = id;
        this.optionId = optionId;
        this.quantity = quantity;
        this.message = message;
    }

    public Long getId() {return id;}

    public Long getOptionId() {return optionId;}

    public int getQuantity() {
        return quantity;
    }

    public String getMessage() {
        return message;
    }

}