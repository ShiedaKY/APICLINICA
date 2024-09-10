package com.example.paciente_api.service;

import com.example.paciente_api.model.Paciente;
import com.example.paciente_api.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente cadastrarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> listarPacientes(){
        return pacienteRepository.findAll();
    }

    public Optional<Paciente> buscarPacientePorId(Long id){
        return pacienteRepository.findById(id);
    }

    public void removerPaciente(Long id){
        pacienteRepository.deleteById(id);
    }
}
