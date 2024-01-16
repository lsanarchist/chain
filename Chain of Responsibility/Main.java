public class Main {
    public static void main(String[] args) {
        OrderHandler validateHandler = new ValidateOrderHandler();
        OrderHandler paymentHandler = new PaymentHandler();

        validateHandler.setNextHandler(paymentHandler);

        Order validOrder = new Order("valid");
        Order invalidOrder = new Order("invalid");
        Order paidOrder = new Order("payment");

        validateHandler.processOrder(validOrder);
        System.out.println("-----");
        validateHandler.processOrder(invalidOrder);
        System.out.println("-----");
        validateHandler.processOrder(paidOrder);
    }
}
