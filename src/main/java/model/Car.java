package model;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Car implements Vehicle {
    public static final Logger logger = LogManager.getLogger(Car.class);
    private final Engine engine;

    public Car(final Engine engine) {
        this.engine = engine;
    }

    @Override
    public void run() {
        logger.info("Car runs!");
    }
}
