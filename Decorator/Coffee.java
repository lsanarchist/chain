// Конкретна реалізація напою - наприклад, кава
public class Coffee implements Beverage {
    @Override
    public String getDescription() {
        return "Кава";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}
