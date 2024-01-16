// Клас, який використовує прототип для створення нового об'єкту
public class PrototypeExample {
    public static void main(String[] args) {
        // Створюємо початковий об'єкт
        ConcretePrototype original = new ConcretePrototype("Original Data");

        // Клонуємо об'єкт
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        // Виводимо дані обох об'єктів
        System.out.println("Original Data: " + original.getData());
        System.out.println("Cloned Data: " + clone.getData());
    }
}
