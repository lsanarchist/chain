// Приклад використання
public class BuilderExample {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();
        ComputerBuilder builder = new HighEndComputerBuilder();

        Computer highEndComputer = director.buildComputer(builder);
        System.out.println(highEndComputer);
    }
}
