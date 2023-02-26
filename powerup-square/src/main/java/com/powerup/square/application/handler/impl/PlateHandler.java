package com.powerup.square.application.handler.impl;

import com.powerup.square.application.dto.PlateRequest;
import com.powerup.square.application.dto.PlateResponse;
import com.powerup.square.application.handler.IPlateHandler;
import com.powerup.square.application.mapper.IPlateRequestMapper;
import com.powerup.square.application.mapper.IPlateResponseMapper;
import com.powerup.square.domain.api.IPlateServicePort;

import com.powerup.square.domain.model.Plate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PlateHandler implements IPlateHandler {

    private final IPlateServicePort iPlateServicePort;
    private final IPlateRequestMapper iPlateRequestMapper;
    private final IPlateResponseMapper iPlateResponseMapper;

    @Override
    public void savePlate(PlateRequest plateRequest) {
        Plate plate = iPlateRequestMapper.toPlate(plateRequest);
        plate.setId(-1L);
        iPlateServicePort.savePlate(plate);
    }

    @Override
    public List<PlateResponse> getAllPlates() {
        return iPlateResponseMapper.toResponseList(iPlateServicePort.getAllPlates()); // mirar el iplateServicePort
    }

    @Override
    public PlateResponse getPlate(Long id) {
        Plate plate = iPlateServicePort.getPlate(id);
        return iPlateResponseMapper.toPlateResponse(plate);
    }

    @Override
    public void updatePlate(PlateRequest plateRequest) {
        Plate plate = iPlateRequestMapper.toPlate(plateRequest);
        iPlateServicePort.updatePlate(plate);
    }

    @Override
    public void deletePlate(Long id) {
     Plate plate =iPlateServicePort.getPlate(id);
     iPlateServicePort.deletePlate(id);
    }





    /*@Override
    public void savePlate(PlateRequest plateRequest) {
        Plate plate = iPlateRequestMapper.toPlate(plateRequest);
        plate.setId(-1L);
        iPlateServicePort.savePlate(plate);

    }

    @Override
    public PlateResponse getPlate(Long id) {
        Plate plate = iPlateServicePort.getPlate(id);
        return iPlateResponseMapper.toPlateResponse(plate);
    }*/



}
