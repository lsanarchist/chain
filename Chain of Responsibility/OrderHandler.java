public interface OrderHandler {
    void processOrder(Order order);

    void setNextHandler(OrderHandler nextHandler);
}
