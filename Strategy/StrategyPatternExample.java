// Приклад використання
public class StrategyPatternExample {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        // Встановлення стратегії оплати через кредитну карту
        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        cart.checkout(100);

        // Зміна стратегії оплати на PayPal
        cart.setPaymentStrategy(new PayPalPayment("example@example.com"));
        cart.checkout(50);
    }
}
