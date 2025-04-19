package com.app.beautybooker.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Entity
public class BeautyService {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String description;
    private Integer durationMinutes;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private ServiceTypeEnum serviceType;

    @ManyToMany
    @JoinTable(
            name = "beauty_service_professionals",
            joinColumns = @JoinColumn(name = "beauty_service_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private List<User> professionals;
}

