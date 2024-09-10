package com.example.paciente_api.repository;

import com.example.paciente_api.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository<Paciente, Long>{
}
