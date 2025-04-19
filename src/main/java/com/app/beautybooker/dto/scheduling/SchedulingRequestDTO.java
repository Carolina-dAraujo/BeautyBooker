package com.app.beautybooker.dto.scheduling;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SchedulingRequestDTO {
    @NotNull
    private int clientId;

    @NotNull
    private int professionalId;

    @NotNull
    private int beautyServiceId;

    @NotNull
    private LocalDateTime dateTime;

    private String details;
}
