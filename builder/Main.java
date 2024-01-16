// Клас продукту
class Computer {
    private String cpu;
    private String ram;
    private String storage;

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                '}';
    }
}

// Інтерфейс будівельника
interface ComputerBuilder {
    void buildCpu();

    void buildRam();

    void buildStorage();

    Computer getResult();
}

// Конкретний будівельник
class HighEndComputerBuilder implements ComputerBuilder {
    private Computer computer = new Computer();

    @Override
    public void buildCpu() {
        computer.setCpu("High-end CPU");
    }

    @Override
    public void buildRam() {
        computer.setRam("32GB RAM");
    }

    @Override
    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    @Override
    public Computer getResult() {
        return computer;
    }
}

// Директор
class ComputerDirector {
    public Computer buildComputer(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
        return builder.getResult();
    }
}

