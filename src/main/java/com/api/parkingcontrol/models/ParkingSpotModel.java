package com.api.parkingcontrol.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Type;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Getter
@Setter
@EqualsAndHashCode
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ParkingSpotModel implements Serializable {

    private static final long serialVersionUID = 8066661668034766939L;

    @Id
    @EqualsAndHashCode.Include
    @Type(type = "pg-uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;

    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    @Column(nullable = false, length = 70)
    private String brandCar;

    @Column(nullable = false, length = 70)
    private String modelCar;

    @Column(nullable = false, length = 70)
    private String colorCar;

    @Column(nullable = false)
    private LocalDateTime registrationDate;

    @Column(nullable = false, length = 130)
    private String responsableName;

    @Column(nullable = false, length = 30)
    private String apartment;

    @Column(nullable = false, length = 30)
    private String block;
}
