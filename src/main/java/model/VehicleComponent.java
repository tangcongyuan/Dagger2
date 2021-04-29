package model;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = { VehicleModule.class })
public interface VehicleComponent {
    Vehicle provideVehicle();
}
