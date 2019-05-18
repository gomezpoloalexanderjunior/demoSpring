package pe.edu.upc.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "pacientes")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nombre", length = 40, nullable = false)
	private String nombre;
	
	@NotBlank
	@NotEmpty
	@Column(name = "apellidos", length = 40, nullable = false)
	private String apellidos;
	
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;
	
	@Min(value = 0)
	@Column(name = "edad", columnDefinition = "SMALLINT")
	private Integer edad;

	@Column(name = "genero", length = 10)
	private String genero;
	
}





