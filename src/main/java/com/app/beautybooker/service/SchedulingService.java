package com.app.beautybooker.service;

import com.app.beautybooker.model.Beauty;
import com.app.beautybooker.model.Scheduling;
import com.app.beautybooker.model.User;
import com.app.beautybooker.repository.BeautyRepository;
import com.app.beautybooker.repository.SchedulingRepository;
import com.app.beautybooker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class SchedulingService {

    @Autowired
    private SchedulingRepository schedulingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BeautyRepository beautyServiceRepository;

    public Scheduling agendar(int clientId, int professionalId, int serviceId, Date dateTime, String details) {
        User client = userRepository.findById(clientId)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        User professional = userRepository.findById(professionalId)
                .orElseThrow(() -> new RuntimeException("Profissional não encontrado"));

        Beauty service = beautyServiceRepository.findById(serviceId)
                .orElseThrow();

        Scheduling scheduling = new Scheduling();
        scheduling.setClient(client);
        scheduling.setProfessional(professional);
        scheduling.setBeautyService(service);
        scheduling.setDateTime(dateTime);
        scheduling.setStatus("AGENDADO");
        scheduling.setDetails(details);

        return schedulingRepository.save(scheduling);
    }

    public List<Scheduling> findByProfessional(int professionalId) {
        return schedulingRepository.findByProfessionalId(professionalId);
    }

    public List<Scheduling> findByClient(int clientId) {
        return schedulingRepository.findByClientId(clientId);
    }

    public void cancelar(int id) {
        Scheduling s = schedulingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
        s.setStatus("CANCELADO");
        schedulingRepository.save(s);
    }

    public void concluir(int id) {
        Scheduling s = schedulingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Agendamento não encontrado"));
        s.setStatus("CONCLUIDO");
        schedulingRepository.save(s);
    }
}
