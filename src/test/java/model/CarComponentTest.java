package model;

import org.junit.Assert;
import org.junit.Test;

public class CarComponentTest {
    @Test
    public void CarInitializationTest() {
        Vehicle vehicle = DaggerVehicleComponent.create().provideVehicle();
        Assert.assertNotNull(vehicle);
        Assert.assertEquals(vehicle.getClass(), Car.class);
    }
}
