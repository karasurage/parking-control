package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;
import java.util.List;
import javax.validation.Valid;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//@Api(tags = "Parking Spot")
@RequestMapping(value = "/v1/parkings-spots")
public interface ParkingSpotDocument {

//    @ApiOperation(
//            value = "Salva a vaga de estacionamento para um usuário, seu veículo, andar e bloco do apartamento",
//            httpMethod = "POST",
//            produces = MediaType.APPLICATION_JSON_VALUE,
//            consumes = MediaType.APPLICATION_JSON_VALUE
//    )
//    @ApiResponses({
//            @ApiResponse(
//                    code = 201, message = ""
//            ),
//            @ApiResponse(
//                    code = 409, message = "Conflict: License Plate Car is already in use!"
//            ),
//            @ApiResponse(
//                    code = 409, message = "Conflict: Parking spot is already in use!"
//            ),
//            @ApiResponse(
//                    code = 409, message = "Conflict: Parking Spot already registered for this apartment/block!"
//            )
//    })
    @PostMapping(
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid ParkingSpotDto parkingSpotDto);

    ResponseEntity<List<ParkingSpotModel>> getAllParkingSpots();

    ResponseEntity<Object> getOnePartkingSpot(Long id);

    ResponseEntity<Object> deleteParkingSpot(Long id);

    ResponseEntity<Object> updateParkingSpot(Long id, ParkingSpotDto parkingSpotDto);
}
