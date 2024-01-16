public class Main {
    public static void main(String[] args) {
        // Отримання єдиного екземпляра підключення до бази даних
        DatabaseConnection dbConnection = DatabaseConnection.getInstance();

        // Виведення деталей підключення
        System.out.println(dbConnection.getConnectionDetails());

        // Спроба створити новий екземпляр - отримаємо той самий єдиний екземпляр
        DatabaseConnection anotherDbConnection = DatabaseConnection.getInstance();

        // Перевірка, чи це той самий об'єкт
        System.out.println(dbConnection == anotherDbConnection); // Виведе true
    }
}
