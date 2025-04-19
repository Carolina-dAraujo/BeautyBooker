package com.app.beautybooker.dto.beauty;

import com.app.beautybooker.model.ServiceTypeEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BeautyRequestDTO {
    @NotBlank
    private String name;

    private String description;

    private Integer durationMinutes;

    private BigDecimal price;

    @NotNull
    private ServiceTypeEnum serviceType;
}
