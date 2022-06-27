package com.api.parkingcontrol.controllers;

import com.api.parkingcontrol.dtos.ParkingSpotDto;
import com.api.parkingcontrol.models.ParkingSpotModel;
import java.util.List;
import org.springframework.http.ResponseEntity;

public interface ParkingSpotDocument {

    ResponseEntity<Object> saveParkingSpot(ParkingSpotDto parkingSpotDto);

    ResponseEntity<List<ParkingSpotModel>> getAllParkingSpots();

    ResponseEntity<Object> getOnePartkingSpot(Long id);

    ResponseEntity<Object> deleteParkingSpot(Long id);

    ResponseEntity<Object> updateParkingSpot(Long id, ParkingSpotDto parkingSpotDto);
}
