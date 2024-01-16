// Підсистема 1
class Engine {
    public void start() {
        System.out.println("Двигун запущено");
    }
}

// Підсистема 2
class AirConditioning {
    public void turnOn() {
        System.out.println("Кондиціонер увімкнено");
    }
}

// Підсистема 3
class Lights {
    public void turnOn() {
        System.out.println("Світильники увімкнено");
    }
}

// Facade
class CarFacade {
    private Engine engine;
    private AirConditioning ac;
    private Lights lights;

    public CarFacade() {
        this.engine = new Engine();
        this.ac = new AirConditioning();
        this.lights = new Lights();
    }

    // Високорівневий інтерфейс для запуску автомобіля
    public void startCar() {
        engine.start();
        ac.turnOn();
        lights.turnOn();
    }
}

