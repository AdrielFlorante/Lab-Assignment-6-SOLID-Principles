public class OrderTest {
    public static void main(String[] args) {
        Order order = new BasicOrder();
        order.calculateTotal(10.0, 2);
        order.placeOrder("John Doe", "123 Main St");

        // demonstrating if we need to use these optional methods in AdvancedOrder
        AdvancedOrder advancedOrder = new AdvancedOrder();
        advancedOrder.calculateTotal(10.0, 2);
        advancedOrder.placeOrder("John Doe", "123 Main St");

        // the methods in AdvancedOrder
        advancedOrder.generateInvoice("order_123.pdf");
        advancedOrder.sendEmailNotification("johndoe@example.com");
    }
}