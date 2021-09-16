package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car implements Vehicle {
    private static final Logger logger = LogManager.getLogger(Car.class);
    private final Engine engine;

    public Car(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car(Engine: " +
                engine.toString() +
                ")";
    }

    @Override
    public void run() {
        logger.info("{} runs!", this.toString());
    }
}
