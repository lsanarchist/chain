public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connectionDetails;

    // Приватний конструктор, щоб не допустити створення екземплярів за межами класу
    private DatabaseConnection() {
        // Ініціалізація з'єднання до бази даних
        this.connectionDetails = "Connected to the database";
    }

    // Публічний метод для отримання єдиного екземпляра класу
    public static DatabaseConnection getInstance() {
        // Якщо екземпляр ще не створено, створити його
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        // Повернути єдиний екземпляр класу
        return instance;
    }

    // Метод для отримання деталей підключення
    public String getConnectionDetails() {
        return connectionDetails;
    }

    // Інші методи для роботи з базою даних...
}
