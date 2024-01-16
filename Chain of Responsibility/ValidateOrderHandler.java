public class ValidateOrderHandler implements OrderHandler {
    private OrderHandler nextHandler;

    @Override
    public void processOrder(Order order) {
        if (order.getOrderType().equalsIgnoreCase("valid")) {
            System.out.println("Замовлення пройшло валідацію.");
        } else {
            System.out.println("Замовлення не валідне.");
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
