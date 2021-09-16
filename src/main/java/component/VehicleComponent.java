package component;

import dagger.Component;
import model.Vehicle;
import module.VehicleModule;

import javax.inject.Singleton;

@Singleton
@Component(modules = { VehicleModule.class })
public interface VehicleComponent {
    Vehicle provideVehicle();
}
