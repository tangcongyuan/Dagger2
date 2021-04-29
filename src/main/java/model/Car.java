package model;

public class Car implements Vehicle {
    private final Engine engine;

    public Car(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        System.out.println("Car runs!");
    }
}
