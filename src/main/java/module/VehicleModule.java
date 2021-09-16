package module;

import dagger.Module;
import dagger.Provides;
import model.Car;
import model.Engine;
import model.Vehicle;

import javax.inject.Named;

import static util.constants.ENGINE_DESCRIPTION;
import static util.constants.ENGINE_MAKE;

@Module
public class VehicleModule {
    @Provides
    @Named("CarEngine")
    public Engine provideEngine() {
        return new Engine.Builder()
                .withMake(ENGINE_MAKE)
                .withDescription(ENGINE_DESCRIPTION)
                .build();
    }

    @Provides
    public Vehicle provideVehicle(@Named("CarEngine") final Engine engine) {
        return new Car(engine);
    }
}
