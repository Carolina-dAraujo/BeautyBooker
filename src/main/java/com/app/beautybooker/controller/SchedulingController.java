package com.app.beautybooker.controller;

import com.app.beautybooker.dto.scheduling.SchedulingRequestDTO;
import com.app.beautybooker.dto.scheduling.SchedulingResponseDTO;
import com.app.beautybooker.service.SchedulingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beautybooker/schedules")
public class SchedulingController {
    @Autowired
    private SchedulingService schedulingService;

    @PostMapping
    public SchedulingResponseDTO createScheduling(@RequestBody SchedulingRequestDTO schedulingRequestDTO) {
        return schedulingService.createScheduling(schedulingRequestDTO);
    }

    @GetMapping("/{id}")
    public SchedulingResponseDTO getSchedulingById(@PathVariable int id) {
        return schedulingService.getSchedulingById(id);
    }
}
