// Інтерфейс, що визначає метод для підключення пристрою
interface Socket {
    void plugIn();
}

// Клас розетки, який реалізує інтерфейс Socket
class EuropeanSocket implements Socket {
    @Override
    public void plugIn() {
        System.out.println("Підключено до європейської розетки");
    }
}

// Адаптер, який дозволяє підключити пристрій до європейської розетки
class Adapter implements Socket {
    private AmericanDevice device;

    public Adapter(AmericanDevice device) {
        this.device = device;
    }

    @Override
    public void plugIn() {
        device.plugInAmericanSocket();
    }
}

// Клас пристрою, який має власний інтерфейс
class AmericanDevice {
    public void plugInAmericanSocket() {
        System.out.println("Підключено до американської розетки");
    }
}

