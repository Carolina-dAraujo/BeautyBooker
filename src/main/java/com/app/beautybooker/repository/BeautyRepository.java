package com.app.beautybooker.repository;

import com.app.beautybooker.model.Beauty;
import com.app.beautybooker.model.ServiceTypeEnum;
import com.app.beautybooker.service.BeautyService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BeautyRepository extends JpaRepository<Beauty, Integer> {
    List<BeautyService> findByServiceType(ServiceTypeEnum serviceType);
}
