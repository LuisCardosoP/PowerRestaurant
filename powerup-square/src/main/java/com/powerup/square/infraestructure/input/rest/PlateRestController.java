package com.powerup.square.infraestructure.input.rest;


import com.powerup.square.application.dto.PlateRequest;
import com.powerup.square.application.dto.PlateResponse;
import com.powerup.square.application.handler.IPlateHandler;
import com.powerup.square.domain.model.Plate;
import com.powerup.square.infraestructure.out.jpa.entity.PlateEntity;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/plates")
@RequiredArgsConstructor
public class PlateRestController {

    private final IPlateHandler plateHandler;


    @PostMapping("/createPlate/")
    public ResponseEntity<Void> savePlateEntity(@RequestBody @Validated PlateRequest plateRequest){
        plateHandler.savePlate(plateRequest);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


    @GetMapping("/{id}")
    public ResponseEntity<PlateResponse> getPlate(@PathVariable (name="id")Long id){

        return ResponseEntity.ok(plateHandler.getPlate(id));
    }


    @PutMapping("/putPlate/")
    public ResponseEntity<Void> editPlateEntity(@RequestBody PlateRequest plateRequest){
        plateHandler.savePlate(plateRequest);
        return null;
    }

    @GetMapping("/")
    public ResponseEntity<List<PlateResponse>>getAllPlates(){
        return ResponseEntity.ok(plateHandler.getAllPlates());
    }



    /*@PutMapping("/updatePlate/{id}")
    public ResponseEntity<Void> updatePlate(@PathVariable("id") Long id, @RequestBody @Validated PlateResponse plateResponse) {
        Plate plateToUpdate = plateHandler.getPlateById(id);
        if (plateToUpdate != null) {
            plateToUpdate.setName(plateResponse.getName());
            plateToUpdate.setIdCategory(plateResponse.getIdCategory());
            plateToUpdate.setDescription(plateResponse.getDescription());
            plateToUpdate.setPrice(plateResponse.getPrice());
            plateToUpdate.setUrlImage(plateResponse.getUrlImage());
            plateHandler.savePlate(plateToUpdate);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }*/







}