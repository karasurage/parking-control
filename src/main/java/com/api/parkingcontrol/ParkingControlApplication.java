package com.api.parkingcontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParkingControlApplication implements ParkingControlApplicationOpenAPI {

    public static void main(String[] args) {
        SpringApplication.run(ParkingControlApplication.class, args);
    }

}
