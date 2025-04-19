package com.app.beautybooker.repository;

import com.app.beautybooker.model.Scheduling;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface SchedulingRepository extends JpaRepository<Scheduling, Integer> {

    List<Scheduling> findByClientId(int clientId);

    List<Scheduling> findByProfessionalId(int professionalId);

    List<Scheduling> findByDateTimeBetween(LocalDateTime start, LocalDateTime end);
}

