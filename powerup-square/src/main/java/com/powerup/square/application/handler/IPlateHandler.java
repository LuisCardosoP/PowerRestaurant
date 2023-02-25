package com.powerup.square.application.handler;

import com.powerup.square.application.dto.PlateRequest;
import com.powerup.square.application.dto.PlateResponse;
import com.powerup.square.domain.model.Plate;

public interface IPlateHandler {

    void savePlate(PlateRequest plateRequest);

    PlateResponse getPlate(Long id);


   void updatePlate(PlateRequest plateRequest);
}
