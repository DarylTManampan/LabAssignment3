public class PaymentApp {

    public static void main(String[] args) {
        java.lang.String item = "Keyboard";
        double unitPrice = 300.0;
        int quantity = 10;

        System.out.println("\nOrder item is " + item );
        System.out.println("Unit price is " + unitPrice );
        System.out.println("Quantity is " + quantity );

        PaymentMode gcash = new Gcash();
        Order gcashOrder = new Order(item, unitPrice, quantity, gcash);
        System.out.println("\nPayment order details if GCash");
        System.out.println("Discount rate is " + gcash.getDiscountRate());
        System.out.println("Payment amount is " + gcashOrder.getTotalAmount());

        PaymentMode maya = new Maya();
        Order mayaOrder = new Order(item, unitPrice, quantity, maya);
        System.out.println("\nPayment order details if Maya");
        System.out.println("Discount rate is " + maya.getDiscountRate());
        System.out.println("Payment amount is " + mayaOrder.getTotalAmount());

        PaymentMode shopeePay = new ShopeePay();
        Order shopeeOrder = new Order(item, unitPrice, quantity, shopeePay);
        System.out.println("\nPayment order details if ShopeePay");
        System.out.println("Discount rate is " + shopeePay.getDiscountRate());
        System.out.println("Payment amount is " + shopeeOrder.getTotalAmount());
    }
}