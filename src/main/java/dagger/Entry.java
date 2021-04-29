package dagger;

import model.DaggerVehicleComponent;
import model.Vehicle;

public class Entry {
    public static void main(String[] args) {
        Vehicle vehicle = DaggerVehicleComponent.create().provideVehicle();
        vehicle.run();
    }
}
