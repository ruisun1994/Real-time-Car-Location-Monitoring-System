package com.yangfei.spring.uber.service;

import com.yangfei.spring.uber.domain.Location;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * Created by Yangfei on 12/31/17.
 */

public interface LocationService {
    List<Location> saveCarLocations(List<Location> carLocations);

    void deleteAll();

    Page<Location> findByVehicleMovementType(String movementType, Pageable pageable);

    Page<Location> findByVin(String vin, Pageable pageable);
}
