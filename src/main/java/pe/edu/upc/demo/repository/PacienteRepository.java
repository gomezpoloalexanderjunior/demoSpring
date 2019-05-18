package pe.edu.upc.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.demo.entity.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Integer>{
	List<Paciente> findByNombre(String nombre) throws Exception; 
}
