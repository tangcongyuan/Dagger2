package dagger;

import component.DaggerVehicleComponent;
import model.Vehicle;

public class Entry {
    public static void main(String[] args) {
        Vehicle vehicle = DaggerVehicleComponent.create().provideVehicle();
        vehicle.run();
    }
}
