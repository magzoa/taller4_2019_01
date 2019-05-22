package py.edu.facitec.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Gerente extends General {
	
	
	private String ci;
	private String nombre;
	
			//Aplicación de relacionamiento bidireccional
			//mappedBy puede ir en Gerente o Departamento
			//anotaciones para generar la clave foranea
	@OneToOne(mappedBy="gerente")
	private Departamento departamento;

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}	
	
	
	

}
