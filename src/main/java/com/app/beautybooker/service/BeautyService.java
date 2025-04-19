package com.app.beautybooker.service;

import com.app.beautybooker.dto.beauty.BeautyRequestDTO;
import com.app.beautybooker.dto.beauty.BeautyResponseDTO;
import com.app.beautybooker.model.Beauty;
import com.app.beautybooker.repository.BeautyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BeautyService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private BeautyRepository beautyRepository;

    public BeautyResponseDTO createBeautyService(BeautyRequestDTO beautyRequestDTO) {
        Beauty beauty = modelMapper.map(beautyRequestDTO, Beauty.class);
        beauty = beautyRepository.save(beauty);
        return modelMapper.map(beauty, BeautyResponseDTO.class);
    }

    public BeautyResponseDTO getBeautyServiceById(int id) {
        Beauty beauty = beautyRepository.findById(id).orElseThrow(() -> new RuntimeException("Serviço não encontrado"));
        return modelMapper.map(beauty, BeautyResponseDTO.class);
    }
}
