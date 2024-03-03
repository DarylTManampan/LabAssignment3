public class Order {
    private String item;
    private double unitPrice;
    private int quantity;
    private PaymentMode paymentMethod;
    private double totalAmount;

    public Order(String item, double unitPrice, int quantity, PaymentMode paymentMethod) {
        this.item = item;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.paymentMethod = paymentMethod;
        calculateTotalAmount();
    }

    private void calculateTotalAmount() {
        double amount = unitPrice * quantity;
        double discountRate = paymentMethod.getDiscountRate();
        totalAmount = amount * (1 - discountRate);
    }

    public String getItem() {
        return item;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public PaymentMode getPaymentMethod() {
        return paymentMethod;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}