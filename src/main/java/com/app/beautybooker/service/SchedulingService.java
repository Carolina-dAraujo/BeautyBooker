package com.app.beautybooker.service;

import com.app.beautybooker.dto.scheduling.SchedulingRequestDTO;
import com.app.beautybooker.dto.scheduling.SchedulingResponseDTO;
import com.app.beautybooker.model.Scheduling;
import com.app.beautybooker.repository.SchedulingRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SchedulingService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private SchedulingRepository schedulingRepository;

    public SchedulingResponseDTO createScheduling(SchedulingRequestDTO schedulingRequestDTO) {
        Scheduling scheduling = modelMapper.map(schedulingRequestDTO, Scheduling.class);

        scheduling = schedulingRepository.save(scheduling);

        return modelMapper.map(scheduling, SchedulingResponseDTO.class);
    }

    public SchedulingResponseDTO getSchedulingById(int id) {
        Scheduling scheduling = schedulingRepository.findById(id).orElseThrow(() -> new RuntimeException("Scheduling not found"));
        return modelMapper.map(scheduling, SchedulingResponseDTO.class);
    }
}
