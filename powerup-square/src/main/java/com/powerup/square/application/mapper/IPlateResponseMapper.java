package com.powerup.square.application.mapper;

import com.powerup.square.application.dto.PlateResponse;
import com.powerup.square.domain.model.Plate;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPlateResponseMapper {

    PlateResponse toPlateResponse(Plate plate); // cambiar po toResponse

    List<PlateResponse> toResponseList(List<Plate>plateList);


}
