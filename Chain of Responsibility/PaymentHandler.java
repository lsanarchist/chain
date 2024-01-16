public class PaymentHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void processOrder(Order order) {
        if (order.getOrderType().equalsIgnoreCase("payment")) {
            System.out.println("Замовлення сплачено.");
        } else {
            System.out.println("Замовлення ще не сплачено.");
            if (nextHandler != null) {
                nextHandler.processOrder(order);
            }
        }
    }

    @Override
    public void setNextHandler(OrderHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
