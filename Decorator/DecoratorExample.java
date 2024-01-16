public class DecoratorExample {
    public static void main(String[] args) {
        // Замовлення кави без додаткових інгредієнтів
        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription() + " коштує " + coffee.cost());

        // Замовлення кави з молоком
        Beverage coffeeWithMilk = new MilkDecorator(new Coffee());
        System.out.println(coffeeWithMilk.getDescription() + " коштує " + coffeeWithMilk.cost());
    }
}
