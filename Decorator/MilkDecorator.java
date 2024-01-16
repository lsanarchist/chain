// Декоратор для додавання молока до напою
public class MilkDecorator implements Beverage {
    private Beverage beverage;

    public MilkDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", з молоком";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.5;
    }
}
