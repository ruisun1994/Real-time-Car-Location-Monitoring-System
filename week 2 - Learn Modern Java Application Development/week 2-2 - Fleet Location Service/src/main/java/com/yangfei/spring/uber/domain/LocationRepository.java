package com.yangfei.spring.uber.domain;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 * Created by Yangfei on 12/31/17.
 */

public interface LocationRepository extends JpaRepository<Location, Long> {

    Page<Location> findByVehicleMovementType(@Param("movementType") Location.VehicleMovementType type, Pageable pageable);

    Page<Location> findByUnitInfoUnitVin(@Param("unitInfo") String unitVin, Pageable pageable);
}