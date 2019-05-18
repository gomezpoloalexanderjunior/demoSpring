package pe.edu.upc.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upc.demo.entity.Paciente;
import pe.edu.upc.demo.repository.PacienteRepository;
import pe.edu.upc.demo.service.PacienteService;

@Service
public class PacienteServiceImpl implements PacienteService {

	@Autowired
	private PacienteRepository pacienteRepository;
	
	@Transactional(readOnly = true)
	@Override
	public List<Paciente> findAll() throws Exception {
		return pacienteRepository.findAll();
	}
	@Transactional
	@Override
	public Paciente save(Paciente t) throws Exception {
		return pacienteRepository.save(t);
	}
	@Transactional
	@Override
	public Paciente update(Paciente t) throws Exception {
		return pacienteRepository.save(t);
	}
	@Transactional(readOnly=true)
	@Override
	public Optional<Paciente> findById(Integer id) throws Exception {
		return pacienteRepository.findById(id);
	}
	@Transactional
	@Override
	public void deleteById(Integer id) throws Exception {
		pacienteRepository.deleteById(id);
		
	}
	@Transactional
	@Override
	public void deleteAll() throws Exception {
		pacienteRepository.deleteAll();
	}
	@Transactional(readOnly=true)
	@Override
	public List<Paciente> findByNombre(String nombre) throws Exception {
		return pacienteRepository.findByNombre(nombre);
	}

}
