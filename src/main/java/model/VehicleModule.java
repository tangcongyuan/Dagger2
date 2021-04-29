package model;

import dagger.Module;
import dagger.Provides;

import javax.inject.Named;

@Module
public class VehicleModule {
    @Provides
    @Named("CarEngine")
    public Engine provideEngine() {
        return new Engine();
    }

    @Provides
    public Vehicle provideVehicle(@Named("CarEngine") final Engine engine) {
        return new Car(engine);
    }
}
