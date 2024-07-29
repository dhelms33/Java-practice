public class Engine {
    void start() {
        System.out.println("Engine started");
    }

}

class Car {
    private Engine engine; // composition seen here

    Car(Engine engine) {
        this.engine = engine;
    }

    void start() {
        engine.start();
        System.out.println("Car has started");
    }

}

public class Main {
    public static void main(String[] args) {
        Engine vtype = new Engine();
        Car Subaru = new Car(vtype);
        Subaru.start();

    }
}
