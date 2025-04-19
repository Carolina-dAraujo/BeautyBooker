package com.app.beautybooker.dto.beauty;

import com.app.beautybooker.model.ServiceTypeEnum;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BeautyResponseDTO {
    private int id;
    private String name;
    private String description;
    private Integer durationMinutes;
    private BigDecimal price;
    private ServiceTypeEnum serviceType;
}
