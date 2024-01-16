// Клієнтський код
public class Client {
    public static void main(String[] args) {
        // Створюємо європейську розетку
        Socket europeanSocket = new EuropeanSocket();

        // Підключаємо пристрій до європейської розетки
        europeanSocket.plugIn();

        // Створюємо американський пристрій
        AmericanDevice americanDevice = new AmericanDevice();

        // Створюємо адаптер і підключаємо американський пристрій до європейської розетки
        Socket adapter = new Adapter(americanDevice);
        adapter.plugIn();
    }
}
