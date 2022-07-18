package com.api.parkingcontrol.services;

import com.api.parkingcontrol.models.ParkingSpotModel;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ParkingSpotService {
    Object save(ParkingSpotModel parkingSpotModel);

    boolean existsByLicensePlateCar(String licensePlateCar);

    boolean existsByParkingSpotNumber(String parkingSpotNumber);

    boolean existsByApartmentAndBlock(String apartment, String block);

    List<ParkingSpotModel> findAll();

    Optional<ParkingSpotModel> findById(UUID id);

    void delete(ParkingSpotModel parkingSpotModel);
}
