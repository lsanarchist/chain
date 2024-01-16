// Інтерфейс або абстрактний клас, який визначає метод клонування
interface Prototype {
    Prototype clone();
}

// Конкретна реалізація класу, який реалізує клонування
class ConcretePrototype implements Prototype {
    private String data;

    public ConcretePrototype(String data) {
        this.data = data;
    }

    // Метод клонування
    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.data);
    }

    public String getData() {
        return data;
    }
}

