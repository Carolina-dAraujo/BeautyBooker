package com.app.beautybooker.controller;

import com.app.beautybooker.dto.beauty.BeautyRequestDTO;
import com.app.beautybooker.dto.beauty.BeautyResponseDTO;
import com.app.beautybooker.service.BeautyService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/beautybooker/beauty")
@Tag(name = "Beauty Services", description = "Beauty services operations")
public class BeautyController {
    @Autowired
    private BeautyService beautyService;

    @PostMapping
    public BeautyResponseDTO createBeautyService(@RequestBody BeautyRequestDTO beautyRequestDTO) {
        return beautyService.createBeautyService(beautyRequestDTO);
    }

    @GetMapping("/{id}")
    public BeautyResponseDTO getBeautyServiceById(@PathVariable int id) {
        return beautyService.getBeautyServiceById(id);
    }
}
