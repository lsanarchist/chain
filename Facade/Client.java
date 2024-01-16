// Клієнтський код
public class Client {
    public static void main(String[] args) {
        // Використання Facade для запуску автомобіля
        CarFacade carFacade = new CarFacade();
        carFacade.startCar();
    }
}
