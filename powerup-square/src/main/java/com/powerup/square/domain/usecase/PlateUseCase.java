package com.powerup.square.domain.usecase;

import com.powerup.square.domain.api.IPlateServicePort;
import com.powerup.square.domain.spi.IPlatePersistencePort;
import com.powerup.square.domain.model.Plate;

import java.util.List;
public class PlateUseCase implements IPlateServicePort {
    private final IPlatePersistencePort platePersistencePort;// inyeccion de dependencias manual, SIN EL @autowite,

    public PlateUseCase(IPlatePersistencePort platePersistencePort) {
        this.platePersistencePort = platePersistencePort;
    }

    @Override
    public void savePlate(Plate plate) {
        platePersistencePort.savePlate(plate);// usamos el metodo que creamos en el spi
    }

    @Override
    public List<Plate> getAllPlates() {
        return   platePersistencePort.getAllPlates();// usamos el metodo que creamos en el spi
    }

    @Override
    public Plate getPlate(Long id) {
        return   platePersistencePort.getPlate(id);// usamos el metodo que creamos en el spi
    }

    @Override
    public void updatePlate(Plate plate) {
          platePersistencePort.updatePlate(plate);
    }

    @Override
    public void deletePlate(Long id) {
           platePersistencePort.deletePlate(id);
    }
    // la inyeccion se hace a traves del contructor
/*  public PlateUseCase(IPlatePersistencePort platePersistencePort) {
        this.platePersistencePort = platePersistencePort;
    }

    @Override
    public void savePlate(Plate plate) {
        platePersistencePort.savePlate(plate);// usamos el metodo que creamos en el spi
    }

    @Override
    public List<Plate> getAllPlates() {
        return platePersistencePort.getAllPlates();
    }

    @Override
    public Plate getPlate(Long id) {
        return platePersistencePort.getPlate(id);
    }

    @Override
    public void updatePlate(Plate plate) {
        platePersistencePort.updatePlate(plate);
    }*/

}

