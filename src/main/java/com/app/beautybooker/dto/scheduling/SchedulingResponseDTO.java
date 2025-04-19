package com.app.beautybooker.dto.scheduling;

import com.app.beautybooker.dto.beauty.BeautyResponseDTO;
import com.app.beautybooker.dto.user.UserResponseDTO;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class SchedulingResponseDTO {
    private int id;
    private UserResponseDTO client;
    private UserResponseDTO professional;
    private BeautyResponseDTO beauty;
    private LocalDateTime dateTime;
    private String status;
    private String details;
}
